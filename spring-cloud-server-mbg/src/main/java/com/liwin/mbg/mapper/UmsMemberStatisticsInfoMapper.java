package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMemberStatisticsInfo;
import com.liwin.mbg.domain.UmsMemberStatisticsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberStatisticsInfoMapper extends BaseMapper<UmsMemberStatisticsInfo> {
    long countByExample(UmsMemberStatisticsInfoExample example);

    int deleteByExample(UmsMemberStatisticsInfoExample example);

    List<UmsMemberStatisticsInfo> selectByExample(UmsMemberStatisticsInfoExample example);

    int updateByExampleSelective(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByExample(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    int insertOrUpdate(UmsMemberStatisticsInfo record);

    int insertOrUpdateSelective(UmsMemberStatisticsInfo record);
}