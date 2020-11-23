package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsResource;
import com.liwin.mbg.domain.UmsResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsResourceMapper extends BaseMapper<UmsResource> {
    long countByExample(UmsResourceExample example);

    int deleteByExample(UmsResourceExample example);

    List<UmsResource> selectByExample(UmsResourceExample example);

    int updateByExampleSelective(@Param("record") UmsResource record, @Param("example") UmsResourceExample example);

    int updateByExample(@Param("record") UmsResource record, @Param("example") UmsResourceExample example);

    int insertOrUpdate(UmsResource record);

    int insertOrUpdateSelective(UmsResource record);
}