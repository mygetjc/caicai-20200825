package com.cc.model.po.fund;

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
 * @date 2020-08-25 18:40:44.219
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_fund")
public class UserFund implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    
        
    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
        
    /**
     * 基金id
     */
    @TableField("fund_id")
    private Integer fundId;
        
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

