package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMemberProductCategoryRelation;
import com.liwin.mbg.domain.UmsMemberProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberProductCategoryRelationMapper extends BaseMapper<UmsMemberProductCategoryRelation> {
    long countByExample(UmsMemberProductCategoryRelationExample example);

    int deleteByExample(UmsMemberProductCategoryRelationExample example);

    List<UmsMemberProductCategoryRelation> selectByExample(UmsMemberProductCategoryRelationExample example);

    int updateByExampleSelective(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);

    int updateByExample(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);

    int insertOrUpdate(UmsMemberProductCategoryRelation record);

    int insertOrUpdateSelective(UmsMemberProductCategoryRelation record);
}