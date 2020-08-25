package com.cc.model.vo.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 19:35:57.141
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserChannelVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * id
     */
	private Integer id;

    /**
     * 渠道名称
     */
	private String name;

    /**
     * 渠道code
     */
	private String code;

    /**
     * 创建时间
     */
	private Date createTime;

    /**
     * 更新时间
     */
	private Date updateTime;

}

