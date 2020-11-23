package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsIntegrationChangeHistory;
import com.liwin.mbg.domain.UmsIntegrationChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsIntegrationChangeHistoryMapper extends BaseMapper<UmsIntegrationChangeHistory> {
    long countByExample(UmsIntegrationChangeHistoryExample example);

    int deleteByExample(UmsIntegrationChangeHistoryExample example);

    List<UmsIntegrationChangeHistory> selectByExample(UmsIntegrationChangeHistoryExample example);

    int updateByExampleSelective(@Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example);

    int updateByExample(@Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example);

    int insertOrUpdate(UmsIntegrationChangeHistory record);

    int insertOrUpdateSelective(UmsIntegrationChangeHistory record);
}