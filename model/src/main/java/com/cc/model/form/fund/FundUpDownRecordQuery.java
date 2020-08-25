package com.cc.model.form.fund;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 18:40:43.983
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class FundUpDownRecordQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("id")
	private Integer id;

    @ApiModelProperty("基金id")
	private Integer fundId;

    @ApiModelProperty("涨跌")
	private String upDown;

    @ApiModelProperty("点数")
	private Double point;

    @ApiModelProperty("盈亏")
	private Double profit;

    @ApiModelProperty("时间")
	private String date;

    @ApiModelProperty("创建时间")
	private Date createTime;

    @ApiModelProperty("更新时间")
	private Date updateTime;
}

