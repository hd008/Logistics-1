package com.logistics.dao;

import com.logistics.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.support.DaoSupport;

import java.util.List;

public class UserDao extends DaoSupport {

    //查询所有用户
    public SessionFactory sessionFactory;


    public Session getSession()
    {
        return sessionFactory.openSession();
    }

    public List<User> queryUsers()
    {
        String hql = "from User";
        List list =  this.getSession().createQuery(hql).list();
        return  list;
    }
    //使用id查询
    public User queryUserById(int id)
    {

        List<User> list = this.getSession().createQuery("from User where id="+id).list();
        if(list.get(0)!=null)
        {
            return (User) list.get(0);
        }
        return null;
    }


    //使用用户名和密码查询
    public User queryUserByUP(User user)
    {
        String hql = "from User where username = '"+ user.getUsername() + "'and password = '" + user.getPassword()+ "'";
        List list =  this.getSession().createQuery(hql).list();
        if(list.get(0)!=null)
        {
            return (User) list.get(0);
        }
        return null;
    }

    //添加用户
    public void addUser(User user)
    {
        this.getSession().save(user);

    }

    //更新用户
    public void updateUser(User user)
    {
        this.getSession().update(user);
    }

    //删除用户
    public void deleteUser(User user)
    {
        this.getSession().delete(user);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    protected void checkDaoConfig() throws IllegalArgumentException {

    }
}
