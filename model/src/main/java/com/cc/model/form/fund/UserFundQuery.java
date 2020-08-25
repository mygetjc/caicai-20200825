package com.cc.model.form.fund;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 18:40:44.152
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UserFundQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("id")
	private Integer id;

    @ApiModelProperty("用户id")
	private Integer userId;

    @ApiModelProperty("基金id")
	private Integer fundId;

    @ApiModelProperty("创建时间")
	private Date createTime;

    @ApiModelProperty("更新时间")
	private Date updateTime;
}

