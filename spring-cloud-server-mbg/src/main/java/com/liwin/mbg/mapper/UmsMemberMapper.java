package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMember;
import com.liwin.mbg.domain.UmsMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberMapper extends BaseMapper<UmsMember> {
    long countByExample(UmsMemberExample example);

    int deleteByExample(UmsMemberExample example);

    List<UmsMember> selectByExample(UmsMemberExample example);

    int updateByExampleSelective(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int updateByExample(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int insertOrUpdate(UmsMember record);

    int insertOrUpdateSelective(UmsMember record);
}