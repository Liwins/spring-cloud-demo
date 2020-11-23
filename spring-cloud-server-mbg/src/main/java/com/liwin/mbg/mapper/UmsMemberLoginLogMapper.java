package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMemberLoginLog;
import com.liwin.mbg.domain.UmsMemberLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLoginLogMapper extends BaseMapper<UmsMemberLoginLog> {
    long countByExample(UmsMemberLoginLogExample example);

    int deleteByExample(UmsMemberLoginLogExample example);

    List<UmsMemberLoginLog> selectByExample(UmsMemberLoginLogExample example);

    int updateByExampleSelective(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);

    int updateByExample(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);

    int insertOrUpdate(UmsMemberLoginLog record);

    int insertOrUpdateSelective(UmsMemberLoginLog record);
}