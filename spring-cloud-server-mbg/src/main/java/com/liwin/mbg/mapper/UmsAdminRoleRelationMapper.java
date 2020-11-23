package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsAdminRoleRelation;
import com.liwin.mbg.domain.UmsAdminRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminRoleRelationMapper extends BaseMapper<UmsAdminRoleRelation> {
    long countByExample(UmsAdminRoleRelationExample example);

    int deleteByExample(UmsAdminRoleRelationExample example);

    List<UmsAdminRoleRelation> selectByExample(UmsAdminRoleRelationExample example);

    int updateByExampleSelective(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    int updateByExample(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    int insertOrUpdate(UmsAdminRoleRelation record);

    int insertOrUpdateSelective(UmsAdminRoleRelation record);
}