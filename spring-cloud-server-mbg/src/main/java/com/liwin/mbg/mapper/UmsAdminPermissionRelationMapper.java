package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsAdminPermissionRelation;
import com.liwin.mbg.domain.UmsAdminPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminPermissionRelationMapper extends BaseMapper<UmsAdminPermissionRelation> {
    long countByExample(UmsAdminPermissionRelationExample example);

    int deleteByExample(UmsAdminPermissionRelationExample example);

    List<UmsAdminPermissionRelation> selectByExample(UmsAdminPermissionRelationExample example);

    int updateByExampleSelective(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);

    int updateByExample(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);

    int insertOrUpdate(UmsAdminPermissionRelation record);

    int insertOrUpdateSelective(UmsAdminPermissionRelation record);
}