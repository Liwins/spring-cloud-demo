package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMemberLevel;
import com.liwin.mbg.domain.UmsMemberLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLevelMapper extends BaseMapper<UmsMemberLevel> {
    long countByExample(UmsMemberLevelExample example);

    int deleteByExample(UmsMemberLevelExample example);

    List<UmsMemberLevel> selectByExample(UmsMemberLevelExample example);

    int updateByExampleSelective(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);

    int updateByExample(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);

    int insertOrUpdate(UmsMemberLevel record);

    int insertOrUpdateSelective(UmsMemberLevel record);
}