package com.sj.dao;

import com.sj.model.User;

/**
 * @author SJ
 */
public interface IUserDao {
    User selectUser(long id);
}
