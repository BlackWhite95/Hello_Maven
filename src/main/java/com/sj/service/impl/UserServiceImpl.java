package com.sj.service.impl;

import com.sj.dao.IUserDao;
import com.sj.model.User;
import com.sj.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author SJ
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}