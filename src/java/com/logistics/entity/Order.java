package com.logistics.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
    private byte id;
    private String orderNum;
    private boolean received;
    private String endPositioin;
    private String startPosition;
    private String curPosition;
    private String describe;

    @Id
    @Column(name = "id", nullable = false)
    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_num", nullable = false, length = 20)
    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "received", nullable = false)
    public boolean isReceived() {
        return received;
    }

    public void setReceived(boolean received) {
        this.received = received;
    }

    @Basic
    @Column(name = "end_positioin", nullable = false, length = 20)
    public String getEndPositioin() {
        return endPositioin;
    }

    public void setEndPositioin(String endPositioin) {
        this.endPositioin = endPositioin;
    }

    @Basic
    @Column(name = "start_position", nullable = false, length = 20)
    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    @Basic
    @Column(name = "cur_position", nullable = false, length = 20)
    public String getCurPosition() {
        return curPosition;
    }

    public void setCurPosition(String curPosition) {
        this.curPosition = curPosition;
    }

    @Basic
    @Column(name = "describe", nullable = true, length = 100)
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (received != order.received) return false;
        if (orderNum != null ? !orderNum.equals(order.orderNum) : order.orderNum != null) return false;
        if (endPositioin != null ? !endPositioin.equals(order.endPositioin) : order.endPositioin != null) return false;
        if (startPosition != null ? !startPosition.equals(order.startPosition) : order.startPosition != null)
            return false;
        if (curPosition != null ? !curPosition.equals(order.curPosition) : order.curPosition != null) return false;
        if (describe != null ? !describe.equals(order.describe) : order.describe != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (orderNum != null ? orderNum.hashCode() : 0);
        result = 31 * result + (received ? 1 : 0);
        result = 31 * result + (endPositioin != null ? endPositioin.hashCode() : 0);
        result = 31 * result + (startPosition != null ? startPosition.hashCode() : 0);
        result = 31 * result + (curPosition != null ? curPosition.hashCode() : 0);
        result = 31 * result + (describe != null ? describe.hashCode() : 0);
        return result;
    }
}
