package com.cc.model.form.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 19:35:57.062
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UserQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("id")
	private Integer id;

    @ApiModelProperty("用户名")
	private String username;

    @ApiModelProperty("昵称")
	private String nickname;

    @ApiModelProperty("密码")
	private String password;

    @ApiModelProperty("头像")
	private String headImage;

    @ApiModelProperty("手机号")
	private String mobile;

    @ApiModelProperty("用户来源")
	private Integer channelId;

    @ApiModelProperty("用户来源")
	private String channelName;

    @ApiModelProperty("是否锁定")
	private String isLock;

    @ApiModelProperty("创建时间")
	private Date createTime;

    @ApiModelProperty("更新时间")
	private Date updateTime;
}

