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
@ApiModel(value = "com-liwin-mbg-domain-UmsClientRoleRelation")
@Data
@TableName(value = "ums_client_role_relation")
public class UmsClientRoleRelation {
    public static final String COL_ID = "id";
    public static final String COL_CLIENT_NO = "client_no";
    public static final String COL_ROLE_NO = "role_no";
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "client_no")
    @ApiModelProperty(value = "")
    private String clientNo;

    @TableField(value = "role_no")
    @ApiModelProperty(value = "")
    private String roleNo;
}