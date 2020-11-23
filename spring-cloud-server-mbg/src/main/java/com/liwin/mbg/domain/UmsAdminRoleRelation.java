package com.liwin.mbg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 后台用户和角色关系表
 */
@ApiModel(value = "com-liwin-mbg-domain-UmsAdminRoleRelation")
@Data
@TableName(value = "ums_admin_role_relation")
public class UmsAdminRoleRelation {
    public static final String COL_ID = "id";
    public static final String COL_ADMIN_ID = "admin_id";
    public static final String COL_ROLE_ID = "role_id";
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "admin_id")
    @ApiModelProperty(value = "")
    private Long adminId;

    @TableField(value = "role_id")
    @ApiModelProperty(value = "")
    private Long roleId;
}