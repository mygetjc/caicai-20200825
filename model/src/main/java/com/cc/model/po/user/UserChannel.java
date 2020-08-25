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
 * @date 2020-08-25 19:35:57.16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_channel")
public class UserChannel implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    
        
    /**
     * 渠道名称
     */
    @TableField("name")
    private String name;
        
    /**
     * 渠道code
     */
    @TableField("code")
    private String code;
        
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

