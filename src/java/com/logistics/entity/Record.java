package com.logistics.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Record {
    private byte id;
    private byte orderId;
    private byte buyerId;
    private byte businessId;

    @Id
    @Column(name = "id", nullable = false)
    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_id", nullable = false)
    public byte getOrderId() {
        return orderId;
    }

    public void setOrderId(byte orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "buyer_id", nullable = false)
    public byte getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(byte buyerId) {
        this.buyerId = buyerId;
    }

    @Basic
    @Column(name = "business_id", nullable = false)
    public byte getBusinessId() {
        return businessId;
    }

    public void setBusinessId(byte businessId) {
        this.businessId = businessId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (id != record.id) return false;
        if (orderId != record.orderId) return false;
        if (buyerId != record.buyerId) return false;
        if (businessId != record.businessId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (int) orderId;
        result = 31 * result + (int) buyerId;
        result = 31 * result + (int) businessId;
        return result;
    }
}
