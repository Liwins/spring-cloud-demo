package com.liwin.mbg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户和标签关系表
 */
@ApiModel(value = "com-liwin-mbg-domain-UmsMemberMemberTagRelation")
@Data
@TableName(value = "ums_member_member_tag_relation")
public class UmsMemberMemberTagRelation {
    public static final String COL_ID = "id";
    public static final String COL_MEMBER_ID = "member_id";
    public static final String COL_TAG_ID = "tag_id";
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value = "")
    private Long memberId;

    @TableField(value = "tag_id")
    @ApiModelProperty(value = "")
    private Long tagId;
}