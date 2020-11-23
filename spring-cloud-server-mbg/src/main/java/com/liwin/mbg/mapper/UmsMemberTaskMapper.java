package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMemberTask;
import com.liwin.mbg.domain.UmsMemberTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberTaskMapper extends BaseMapper<UmsMemberTask> {
    long countByExample(UmsMemberTaskExample example);

    int deleteByExample(UmsMemberTaskExample example);

    List<UmsMemberTask> selectByExample(UmsMemberTaskExample example);

    int updateByExampleSelective(@Param("record") UmsMemberTask record, @Param("example") UmsMemberTaskExample example);

    int updateByExample(@Param("record") UmsMemberTask record, @Param("example") UmsMemberTaskExample example);

    int insertOrUpdate(UmsMemberTask record);

    int insertOrUpdateSelective(UmsMemberTask record);
}