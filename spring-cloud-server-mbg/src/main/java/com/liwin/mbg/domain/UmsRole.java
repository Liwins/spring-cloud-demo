package com.liwin.mbg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户角色表
 */
@ApiModel(value = "com-liwin-mbg-domain-UmsRole")
@Data
@TableName(value = "ums_role")
public class UmsRole {
    public static final String COL_ROLE_NO = "role_no";
    public static final String COL_ROLE_NAME = "role_name";
    public static final String COL_REMARK = "remark";
    public static final String COL_CREATE_AT = "create_at";
    public static final String COL_UPDATE_AT = "update_at";
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_ADMIN_COUNT = "admin_count";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_STATUS = "status";
    public static final String COL_SORT = "sort";
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * 名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 后台用户数量
     */
    @TableField(value = "admin_count")
    @ApiModelProperty(value = "后台用户数量")
    private Integer adminCount;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 启用状态：0->禁用；1->启用
     */
    @TableField(value = "status")
    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @TableField(value = "sort")
    @ApiModelProperty(value = "")
    private Integer sort;
}