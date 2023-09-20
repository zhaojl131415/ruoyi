package com.acm.biz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.acm.biz.mapper.BizGermplasmMapper;
import com.acm.biz.domain.BizGermplasm;
import com.acm.biz.service.IBizGermplasmService;
import com.acm.common.core.text.Convert;

/**
 * 种质资源Service业务层处理
 * 
 * @author zhaojinliang
 * @date 2023-09-15
 */
@Service
public class BizGermplasmServiceImpl implements IBizGermplasmService 
{
    @Autowired
    private BizGermplasmMapper bizGermplasmMapper;

    /**
     * 查询种质资源
     * 
     * @param id 种质资源主键
     * @return 种质资源
     */
    @Override
    public BizGermplasm selectBizGermplasmById(String id)
    {
        return bizGermplasmMapper.selectBizGermplasmById(id);
    }

    /**
     * 查询种质资源列表
     * 
     * @param bizGermplasm 种质资源
     * @return 种质资源
     */
    @Override
    public List<BizGermplasm> selectBizGermplasmList(BizGermplasm bizGermplasm)
    {
        return bizGermplasmMapper.selectBizGermplasmList(bizGermplasm);
    }

    /**
     * 新增种质资源
     * 
     * @param bizGermplasm 种质资源
     * @return 结果
     */
    @Override
    public int insertBizGermplasm(BizGermplasm bizGermplasm)
    {
        return bizGermplasmMapper.insertBizGermplasm(bizGermplasm);
    }

    /**
     * 修改种质资源
     * 
     * @param bizGermplasm 种质资源
     * @return 结果
     */
    @Override
    public int updateBizGermplasm(BizGermplasm bizGermplasm)
    {
        return bizGermplasmMapper.updateBizGermplasm(bizGermplasm);
    }

    /**
     * 批量删除种质资源
     * 
     * @param ids 需要删除的种质资源主键
     * @return 结果
     */
    @Override
    public int deleteBizGermplasmByIds(String ids)
    {
        return bizGermplasmMapper.deleteBizGermplasmByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除种质资源信息
     * 
     * @param id 种质资源主键
     * @return 结果
     */
    @Override
    public int deleteBizGermplasmById(String id)
    {
        return bizGermplasmMapper.deleteBizGermplasmById(id);
    }
}
