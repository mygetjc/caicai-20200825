package com.cc.model.po.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 19:35:57.072
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class User implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    
        
    /**
     * 用户名
     */
    @TableField("username")
    private String username;
        
    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;
        
    /**
     * 密码
     */
    @TableField("password")
    private String password;
        
    /**
     * 头像
     */
    @TableField("head_image")
    private String headImage;
        
    /**
     * 手机号
     */
    @TableField("mobile")
    private String mobile;
        
    /**
     * 用户来源
     */
    @TableField("channel_id")
    private Integer channelId;
        
    /**
     * 用户来源
     */
    @TableField("channel_name")
    private String channelName;
        
    /**
     * 是否锁定
     */
    @TableField("is_lock")
    private String isLock;
        
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
        
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    }

