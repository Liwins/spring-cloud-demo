package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsRoleMenuRelation;
import com.liwin.mbg.domain.UmsRoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleMenuRelationMapper extends BaseMapper<UmsRoleMenuRelation> {
    long countByExample(UmsRoleMenuRelationExample example);

    int deleteByExample(UmsRoleMenuRelationExample example);

    List<UmsRoleMenuRelation> selectByExample(UmsRoleMenuRelationExample example);

    int updateByExampleSelective(@Param("record") UmsRoleMenuRelation record, @Param("example") UmsRoleMenuRelationExample example);

    int updateByExample(@Param("record") UmsRoleMenuRelation record, @Param("example") UmsRoleMenuRelationExample example);

    int insertOrUpdate(UmsRoleMenuRelation record);

    int insertOrUpdateSelective(UmsRoleMenuRelation record);
}