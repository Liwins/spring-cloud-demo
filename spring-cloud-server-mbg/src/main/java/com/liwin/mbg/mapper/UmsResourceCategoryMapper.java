package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsResourceCategory;
import com.liwin.mbg.domain.UmsResourceCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsResourceCategoryMapper extends BaseMapper<UmsResourceCategory> {
    long countByExample(UmsResourceCategoryExample example);

    int deleteByExample(UmsResourceCategoryExample example);

    List<UmsResourceCategory> selectByExample(UmsResourceCategoryExample example);

    int updateByExampleSelective(@Param("record") UmsResourceCategory record, @Param("example") UmsResourceCategoryExample example);

    int updateByExample(@Param("record") UmsResourceCategory record, @Param("example") UmsResourceCategoryExample example);

    int insertOrUpdate(UmsResourceCategory record);

    int insertOrUpdateSelective(UmsResourceCategory record);
}