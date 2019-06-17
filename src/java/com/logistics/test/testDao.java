package com.logistics.test;

import com.logistics.dao.UserDao;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class testDao {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        System.out.println(userDao.queryUsers());

//        DataSource dataSource = (DataSource) ac.getBean("dataSource");
//        try {
//            System.out.println(dataSource.getConnection().createStatement().executeQuery("select  * from  user").next());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
