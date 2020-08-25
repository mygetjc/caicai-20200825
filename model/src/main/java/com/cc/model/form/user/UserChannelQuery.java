package com.cc.model.form.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 19:35:57.152
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UserChannelQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("id")
	private Integer id;

    @ApiModelProperty("渠道名称")
	private String name;

    @ApiModelProperty("渠道code")
	private String code;

    @ApiModelProperty("创建时间")
	private Date createTime;

    @ApiModelProperty("更新时间")
	private Date updateTime;
}

