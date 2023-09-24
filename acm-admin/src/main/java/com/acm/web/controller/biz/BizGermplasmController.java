package com.acm.web.controller.biz;

import java.util.Date;
import java.util.List;

import com.acm.common.utils.DateUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.acm.common.annotation.Log;
import com.acm.common.enums.BusinessType;
import com.acm.biz.domain.BizGermplasm;
import com.acm.biz.service.IBizGermplasmService;
import com.acm.common.core.controller.BaseController;
import com.acm.common.core.domain.AjaxResult;
import com.acm.common.utils.poi.ExcelUtil;
import com.acm.common.core.page.TableDataInfo;

/**
 * 种质资源Controller
 * 
 * @author zhaojinliang
 * @date 2023-09-15
 */
@Controller
@RequestMapping("/biz/germplasm")
public class BizGermplasmController extends BaseController
{
    private String prefix = "biz/germplasm";

    @Autowired
    private IBizGermplasmService bizGermplasmService;

    @RequiresPermissions("biz:germplasm:view")
    @GetMapping()
    public String germplasm()
    {
        return prefix + "/germplasm";
    }

    /**
     * 查询种质资源列表
     */
    @RequiresPermissions("biz:germplasm:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BizGermplasm bizGermplasm)
    {
        startPage();
        List<BizGermplasm> list = bizGermplasmService.selectBizGermplasmList(bizGermplasm);
        return getDataTable(list);
    }

    /**
     * 导出种质资源列表
     */
    @RequiresPermissions("biz:germplasm:export")
    @Log(title = "种质资源", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BizGermplasm bizGermplasm)
    {
        List<BizGermplasm> list = bizGermplasmService.selectBizGermplasmList(bizGermplasm);
        ExcelUtil<BizGermplasm> util = new ExcelUtil<BizGermplasm>(BizGermplasm.class);
        return util.exportExcel(list, "种质资源数据");
    }

    /**
     * 新增种质资源
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存种质资源
     */
    @RequiresPermissions("biz:germplasm:add")
    @Log(title = "种质资源", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BizGermplasm bizGermplasm)
    {
        bizGermplasm.setCreateBy(getLoginName());
        bizGermplasm.setUpdateBy(getLoginName());
        Date nowDate = DateUtils.getNowDate();
        bizGermplasm.setCreateTime(nowDate);
        bizGermplasm.setUpdateTime(nowDate);
        return toAjax(bizGermplasmService.insertBizGermplasm(bizGermplasm));
    }

    /**
     * 修改种质资源
     */
    @RequiresPermissions("biz:germplasm:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        BizGermplasm bizGermplasm = bizGermplasmService.selectBizGermplasmById(id);
        mmap.put("bizGermplasm", bizGermplasm);
        return prefix + "/edit";
    }

    /**
     * 修改保存种质资源
     */
    @RequiresPermissions("biz:germplasm:edit")
    @Log(title = "种质资源", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BizGermplasm bizGermplasm)
    {
        bizGermplasm.setUpdateBy(getLoginName());
        bizGermplasm.setUpdateTime(DateUtils.getNowDate());
        return toAjax(bizGermplasmService.updateBizGermplasm(bizGermplasm));
    }

    /**
     * 删除种质资源
     */
    @RequiresPermissions("biz:germplasm:remove")
    @Log(title = "种质资源", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bizGermplasmService.deleteBizGermplasmByIds(ids));
    }
}
