package com.fund.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.model.po.fund.UserFund;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author jc
 * @since 2020-08-24
 */
@Mapper
public interface UserFundDao extends BaseMapper<UserFund> {

}
