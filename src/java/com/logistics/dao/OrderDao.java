package com.logistics.dao;

import com.logistics.entity.Order;
import org.hibernate.SessionFactory;
import org.springframework.dao.support.DaoSupport;
import org.hibernate.Session;

import java.util.List;

public class OrderDao extends DaoSupport {
    public SessionFactory sessionFactory;


    public Session getSession()
    {
        return sessionFactory.openSession();
    }

    //查询所有订单
    public List<Order> queryOrders()
    {
        String hql = "from Order ";
        List list =  this.getSession().createQuery(hql).list();
        return  list;
    }
    //使用id查询订单
    public Order queryOrderById(int id)
    {

        List<Order> list = this.getSession().createQuery("from Order where id="+id).list();
        if(list.get(0)!=null)
        {
            return (Order) list.get(0);
        }
        return null;
    }


    //添加订单
    public void addOrder(Order order)
    {
        this.getSession().save(order);

    }

    //更新订单
    public void updateOrder(Order order)
    {
        this.getSession().update(order);
    }

    //删除订单
    public void deleteOrder(Order order)
    {
        this.getSession().delete(order);
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
