package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsRole;
import com.liwin.mbg.domain.UmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleMapper extends BaseMapper<UmsRole> {
    long countByExample(UmsRoleExample example);

    int deleteByExample(UmsRoleExample example);

    List<UmsRole> selectByExample(UmsRoleExample example);

    int updateByExampleSelective(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    int updateByExample(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    int insertOrUpdate(UmsRole record);

    int insertOrUpdateSelective(UmsRole record);
}