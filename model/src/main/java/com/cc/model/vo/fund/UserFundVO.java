package com.cc.model.vo.fund;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 18:40:44.133
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserFundVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * id
     */
	private Integer id;

    /**
     * 用户id
     */
	private Integer userId;

    /**
     * 基金id
     */
	private Integer fundId;

    /**
     * 创建时间
     */
	private Date createTime;

    /**
     * 更新时间
     */
	private Date updateTime;

}

