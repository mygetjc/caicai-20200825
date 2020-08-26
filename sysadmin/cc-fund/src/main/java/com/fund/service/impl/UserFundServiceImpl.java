package com.fund.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.model.po.fund.UserFund;
import com.fund.dao.UserFundDao;
import com.fund.service.UserFundService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jc
 * @since 2020-08-24
 */
@Service
public class UserFundServiceImpl extends ServiceImpl<UserFundDao, UserFund> implements UserFundService {

}
