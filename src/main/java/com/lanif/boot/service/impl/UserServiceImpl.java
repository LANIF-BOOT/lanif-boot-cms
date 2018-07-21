package com.lanif.boot.service.impl;

import com.lanif.boot.dao.UserMapper;
import com.lanif.boot.model.User;
import com.lanif.boot.service.UserService;
import com.lanif.boot.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by weiq on 2018/07/18.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
