package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMenu;
import com.liwin.mbg.domain.UmsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMenuMapper extends BaseMapper<UmsMenu> {
    long countByExample(UmsMenuExample example);

    int deleteByExample(UmsMenuExample example);

    List<UmsMenu> selectByExample(UmsMenuExample example);

    int updateByExampleSelective(@Param("record") UmsMenu record, @Param("example") UmsMenuExample example);

    int updateByExample(@Param("record") UmsMenu record, @Param("example") UmsMenuExample example);

    int insertOrUpdate(UmsMenu record);

    int insertOrUpdateSelective(UmsMenu record);
}