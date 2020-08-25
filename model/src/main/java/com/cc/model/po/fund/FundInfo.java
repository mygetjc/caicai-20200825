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
 * @date 2020-08-25 18:40:43.811
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("fund_info")
public class FundInfo implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    
        
    /**
     * 名称
     */
    @TableField("name")
    private String name;
        
    /**
     * 代码
     */
    @TableField("code")
    private String code;
        
    /**
     * 单位净值
     */
    @TableField("unit_net")
    private Double unitNet;
        
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

