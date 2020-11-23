package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMemberRuleSetting;
import com.liwin.mbg.domain.UmsMemberRuleSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberRuleSettingMapper extends BaseMapper<UmsMemberRuleSetting> {
    long countByExample(UmsMemberRuleSettingExample example);

    int deleteByExample(UmsMemberRuleSettingExample example);

    List<UmsMemberRuleSetting> selectByExample(UmsMemberRuleSettingExample example);

    int updateByExampleSelective(@Param("record") UmsMemberRuleSetting record, @Param("example") UmsMemberRuleSettingExample example);

    int updateByExample(@Param("record") UmsMemberRuleSetting record, @Param("example") UmsMemberRuleSettingExample example);

    int insertOrUpdate(UmsMemberRuleSetting record);

    int insertOrUpdateSelective(UmsMemberRuleSetting record);
}