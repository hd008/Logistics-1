package com.logistics.action;

import com.logistics.entity.User;
import com.logistics.service.UserService;

public class TestAction  {

    public User user;
    public UserService userService;


    @Override
    public String toString() {
        return super.toString();
    }

    public String execute()
    {
        return "success";
    }

    public String login(){
        return userService.login(user);
    }
    public String test()
    {
        System.out.println("ok");
        return "success";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
