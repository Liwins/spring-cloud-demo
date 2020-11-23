package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsRolePermissionRelation;
import com.liwin.mbg.domain.UmsRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRolePermissionRelationMapper extends BaseMapper<UmsRolePermissionRelation> {
    long countByExample(UmsRolePermissionRelationExample example);

    int deleteByExample(UmsRolePermissionRelationExample example);

    List<UmsRolePermissionRelation> selectByExample(UmsRolePermissionRelationExample example);

    int updateByExampleSelective(@Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example);

    int updateByExample(@Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example);

    int insertOrUpdate(UmsRolePermissionRelation record);

    int insertOrUpdateSelective(UmsRolePermissionRelation record);
}