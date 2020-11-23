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
 * 后台资源表
 */
@ApiModel(value = "com-liwin-mbg-domain-UmsResource")
@Data
@TableName(value = "ums_resource")
public class UmsResource {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_NAME = "name";
    public static final String COL_URL = "url";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_CATEGORY_ID = "category_id";
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 资源名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value = "资源名称")
    private String name;

    /**
     * 资源URL
     */
    @TableField(value = "url")
    @ApiModelProperty(value = "资源URL")
    private String url;

    /**
     * 描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 资源分类ID
     */
    @TableField(value = "category_id")
    @ApiModelProperty(value = "资源分类ID")
    private Long categoryId;
}