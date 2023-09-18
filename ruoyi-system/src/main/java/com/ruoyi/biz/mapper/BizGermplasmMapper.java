package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizGermplasm;

/**
 * 种质资源Mapper接口
 * 
 * @author zhaojinliang
 * @date 2023-09-15
 */
public interface BizGermplasmMapper 
{
    /**
     * 查询种质资源
     * 
     * @param id 种质资源主键
     * @return 种质资源
     */
    public BizGermplasm selectBizGermplasmById(String id);

    /**
     * 查询种质资源列表
     * 
     * @param bizGermplasm 种质资源
     * @return 种质资源集合
     */
    public List<BizGermplasm> selectBizGermplasmList(BizGermplasm bizGermplasm);

    /**
     * 新增种质资源
     * 
     * @param bizGermplasm 种质资源
     * @return 结果
     */
    public int insertBizGermplasm(BizGermplasm bizGermplasm);

    /**
     * 修改种质资源
     * 
     * @param bizGermplasm 种质资源
     * @return 结果
     */
    public int updateBizGermplasm(BizGermplasm bizGermplasm);

    /**
     * 删除种质资源
     * 
     * @param id 种质资源主键
     * @return 结果
     */
    public int deleteBizGermplasmById(String id);

    /**
     * 批量删除种质资源
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizGermplasmByIds(String[] ids);
}
