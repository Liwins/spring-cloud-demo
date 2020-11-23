package com.liwin.mbg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 后台角色菜单关系表
 */
@ApiModel(value = "com-liwin-mbg-domain-UmsRoleMenuRelation")
@Data
@TableName(value = "ums_role_menu_relation")
public class UmsRoleMenuRelation {
    public static final String COL_ROLE_NO = "role_no";
    public static final String COL_ID = "id";
    public static final String COL_ROLE_ID = "role_id";
    public static final String COL_MENU_ID = "menu_id";
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    /**
     * 菜单ID
     */
    @TableField(value = "menu_id")
    @ApiModelProperty(value = "菜单ID")
    private Long menuId;
}