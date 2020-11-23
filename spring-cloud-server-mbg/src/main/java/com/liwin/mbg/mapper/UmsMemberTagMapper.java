package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMemberTag;
import com.liwin.mbg.domain.UmsMemberTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberTagMapper extends BaseMapper<UmsMemberTag> {
    long countByExample(UmsMemberTagExample example);

    int deleteByExample(UmsMemberTagExample example);

    List<UmsMemberTag> selectByExample(UmsMemberTagExample example);

    int updateByExampleSelective(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    int updateByExample(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    int insertOrUpdate(UmsMemberTag record);

    int insertOrUpdateSelective(UmsMemberTag record);
}