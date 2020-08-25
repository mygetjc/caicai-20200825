package com.cc.model.form.fund;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 18:40:43.791
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class FundInfoQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("id")
	private Integer id;

    @ApiModelProperty("名称")
	private String name;

    @ApiModelProperty("代码")
	private String code;

    @ApiModelProperty("单位净值")
	private Double unitNet;

    @ApiModelProperty("创建时间")
	private Date createTime;

    @ApiModelProperty("更新时间")
	private Date updateTime;
}

