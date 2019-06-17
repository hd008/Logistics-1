package com.logistics.service.UserServiceImpl;

import com.logistics.dao.UserDao;
import com.logistics.entity.User;
import com.logistics.service.UserService;

public class UserServiceImpl implements UserService {

    public UserDao userDao;


    @Override
    public String login(User user) {
        if (userDao.queryUserByUP(user)!=null)
        {
            return "success";
        }
        return "fail";
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
