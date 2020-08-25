package com.cc.model.vo.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 19:35:56.95
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * id
     */
	private Integer id;

    /**
     * 用户名
     */
	private String username;

    /**
     * 昵称
     */
	private String nickname;

    /**
     * 密码
     */
	private String password;

    /**
     * 头像
     */
	private String headImage;

    /**
     * 手机号
     */
	private String mobile;

    /**
     * 用户来源
     */
	private Integer channelId;

    /**
     * 用户来源
     */
	private String channelName;

    /**
     * 是否锁定
     */
	private String isLock;

    /**
     * 创建时间
     */
	private Date createTime;

    /**
     * 更新时间
     */
	private Date updateTime;

}

