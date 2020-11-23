package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsRoleResourceRelation;
import com.liwin.mbg.domain.UmsRoleResourceRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleResourceRelationMapper extends BaseMapper<UmsRoleResourceRelation> {
    long countByExample(UmsRoleResourceRelationExample example);

    int deleteByExample(UmsRoleResourceRelationExample example);

    List<UmsRoleResourceRelation> selectByExample(UmsRoleResourceRelationExample example);

    int updateByExampleSelective(@Param("record") UmsRoleResourceRelation record, @Param("example") UmsRoleResourceRelationExample example);

    int updateByExample(@Param("record") UmsRoleResourceRelation record, @Param("example") UmsRoleResourceRelationExample example);

    int insertOrUpdate(UmsRoleResourceRelation record);

    int insertOrUpdateSelective(UmsRoleResourceRelation record);
}