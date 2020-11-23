package com.liwin.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwin.mbg.domain.UmsMemberReceiveAddress;
import com.liwin.mbg.domain.UmsMemberReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberReceiveAddressMapper extends BaseMapper<UmsMemberReceiveAddress> {
    long countByExample(UmsMemberReceiveAddressExample example);

    int deleteByExample(UmsMemberReceiveAddressExample example);

    List<UmsMemberReceiveAddress> selectByExample(UmsMemberReceiveAddressExample example);

    int updateByExampleSelective(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    int updateByExample(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    int insertOrUpdate(UmsMemberReceiveAddress record);

    int insertOrUpdateSelective(UmsMemberReceiveAddress record);
}