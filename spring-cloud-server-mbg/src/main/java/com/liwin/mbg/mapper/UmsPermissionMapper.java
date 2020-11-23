package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsPermission;
import com.liwin.mbg.domain.UmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsPermissionMapper extends BaseMapper<UmsPermission> {
    long countByExample(UmsPermissionExample example);

    int deleteByExample(UmsPermissionExample example);

    List<UmsPermission> selectByExample(UmsPermissionExample example);

    int updateByExampleSelective(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    int updateByExample(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    int insertOrUpdate(UmsPermission record);

    int insertOrUpdateSelective(UmsPermission record);
}