package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsClientRoleRelation;
import com.liwin.mbg.domain.UmsClientRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsClientRoleRelationMapper extends BaseMapper<UmsClientRoleRelation> {
    long countByExample(UmsClientRoleRelationExample example);

    int deleteByExample(UmsClientRoleRelationExample example);

    List<UmsClientRoleRelation> selectByExample(UmsClientRoleRelationExample example);

    int updateByExampleSelective(@Param("record") UmsClientRoleRelation record, @Param("example") UmsClientRoleRelationExample example);

    int updateByExample(@Param("record") UmsClientRoleRelation record, @Param("example") UmsClientRoleRelationExample example);

    int insertOrUpdate(UmsClientRoleRelation record);

    int insertOrUpdateSelective(UmsClientRoleRelation record);
}