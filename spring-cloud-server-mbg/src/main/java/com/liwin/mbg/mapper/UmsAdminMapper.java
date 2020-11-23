package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsAdmin;
import com.liwin.mbg.domain.UmsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminMapper extends BaseMapper<UmsAdmin> {
    long countByExample(UmsAdminExample example);

    int deleteByExample(UmsAdminExample example);

    List<UmsAdmin> selectByExample(UmsAdminExample example);

    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int insertOrUpdate(UmsAdmin record);

    int insertOrUpdateSelective(UmsAdmin record);
}