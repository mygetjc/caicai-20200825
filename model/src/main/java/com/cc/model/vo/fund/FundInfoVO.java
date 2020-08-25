package com.cc.model.vo.fund;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 18:40:43.554
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class FundInfoVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * id
     */
	private Integer id;

    /**
     * 名称
     */
	private String name;

    /**
     * 代码
     */
	private String code;

    /**
     * 单位净值
     */
	private Double unitNet;

    /**
     * 创建时间
     */
	private Date createTime;

    /**
     * 更新时间
     */
	private Date updateTime;

}

