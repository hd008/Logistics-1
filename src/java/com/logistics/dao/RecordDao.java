package com.logistics.dao;

import com.logistics.entity.Order;
import com.logistics.entity.Record;
import com.logistics.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.dao.support.DaoSupport;
import org.hibernate.Session;

import java.util.List;

public class RecordDao extends DaoSupport {
    public SessionFactory sessionFactory;


    public Session getSession()
    {
        return sessionFactory.openSession();
    }

    //查询所有记录
    public List<Record> queryRecords()
    {
        String hql = "from Record ";
        List list =  this.getSession().createQuery(hql).list();
        return  list;
    }
    //使用id查询记录
    public Record queryRecordById(int id)
    {

        List list = this.getSession().createQuery("from Record where id="+id).list();
        if(list.get(0)!=null)
        {
            return (Record)list.get(0);
        }
        return null;
    }

    //添加记录
    public void addRecord(Record record)
    {
        this.getSession().save(record);

    }


    //通过订单查询记录
    public List<Record> queryByOrder(Order order)
    {
        return this.getSession().createQuery("from Record where orderId="+order.getId()).list();
    }

    //查询买家所有交易记录
    public List<Record> queryByBuyer(User buyer)
    {
        return this.getSession().createQuery("from Record where buyerId="+buyer.getId()).list();
    }

    //查询买家所有交易记录
    public List<Record> queryByBusiness(User business)
    {
        return this.getSession().createQuery("from Record where businessId="+business.getId()).list();
    }

    //更新记录
    public void updateRecord(Record record)
    {
        this.getSession().update(record);
    }

    //删除记录
    public void deleteRecord(Record record)
    {
        this.getSession().delete(record);
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

