package com.ang.delivery.service.impl;

import com.ang.delivery.mapper.UserMapper;
import com.ang.delivery.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ang.delivery.model.User;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Date 2021/2/7
 * @Author yxs
 * @Version 1.0
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}