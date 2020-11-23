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
 * 后台用户登录日志表
 */
@ApiModel(value = "com-liwin-mbg-domain-UmsAdminLoginLog")
@Data
@TableName(value = "ums_admin_login_log")
public class UmsAdminLoginLog {
    public static final String COL_ID = "id";
    public static final String COL_ADMIN_ID = "admin_id";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_IP = "ip";
    public static final String COL_ADDRESS = "address";
    public static final String COL_USER_AGENT = "user_agent";
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "admin_id")
    @ApiModelProperty(value = "")
    private Long adminId;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "")
    private Date createTime;

    @TableField(value = "ip")
    @ApiModelProperty(value = "")
    private String ip;

    @TableField(value = "address")
    @ApiModelProperty(value = "")
    private String address;

    /**
     * 浏览器登录类型
     */
    @TableField(value = "user_agent")
    @ApiModelProperty(value = "浏览器登录类型")
    private String userAgent;
}