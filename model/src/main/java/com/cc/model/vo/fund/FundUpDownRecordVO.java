package com.cc.model.vo.fund;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-25 18:40:43.967
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class FundUpDownRecordVO implements Serializable {
    private static final long serialVersionUID = -1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 基金id
     */
    private Integer fundId;

    /**
     * 涨跌
     */
    private String upDown;

    /**
     * 点数
     */
    private Double point;

    /**
     * 盈亏
     */
    private Double profit;

    /**
     * 时间
     */
    private String date;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}

