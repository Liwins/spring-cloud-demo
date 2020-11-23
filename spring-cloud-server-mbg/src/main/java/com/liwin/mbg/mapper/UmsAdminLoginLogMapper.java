package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsAdminLoginLog;
import com.liwin.mbg.domain.UmsAdminLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminLoginLogMapper extends BaseMapper<UmsAdminLoginLog> {
    long countByExample(UmsAdminLoginLogExample example);

    int deleteByExample(UmsAdminLoginLogExample example);

    List<UmsAdminLoginLog> selectByExample(UmsAdminLoginLogExample example);

    int updateByExampleSelective(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int updateByExample(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int insertOrUpdate(UmsAdminLoginLog record);

    int insertOrUpdateSelective(UmsAdminLoginLog record);
}