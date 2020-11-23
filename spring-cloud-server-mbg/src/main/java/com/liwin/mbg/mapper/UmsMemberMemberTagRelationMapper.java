package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMemberMemberTagRelation;
import com.liwin.mbg.domain.UmsMemberMemberTagRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberMemberTagRelationMapper extends BaseMapper<UmsMemberMemberTagRelation> {
    long countByExample(UmsMemberMemberTagRelationExample example);

    int deleteByExample(UmsMemberMemberTagRelationExample example);

    List<UmsMemberMemberTagRelation> selectByExample(UmsMemberMemberTagRelationExample example);

    int updateByExampleSelective(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    int updateByExample(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    int insertOrUpdate(UmsMemberMemberTagRelation record);

    int insertOrUpdateSelective(UmsMemberMemberTagRelation record);
}