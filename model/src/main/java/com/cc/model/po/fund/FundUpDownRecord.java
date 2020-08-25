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
 * @date 2020-08-25 18:40:44.003
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("fund_up_down_record")
public class FundUpDownRecord implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    
        
    /**
     * 基金id
     */
    @TableField("fund_id")
    private Integer fundId;
        
    /**
     * 涨跌
     */
    @TableField("up_down")
    private String upDown;
        
    /**
     * 点数
     */
    @TableField("point")
    private Double point;
        
    /**
     * 盈亏
     */
    @TableField("profit")
    private Double profit;
        
    /**
     * 时间
     */
    @TableField("date")
    private String date;
        
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

