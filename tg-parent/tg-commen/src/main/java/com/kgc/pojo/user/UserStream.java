package com.kgc.pojo.user;

import java.io.Serializable;

public class UserStream implements Serializable {
    private Integer id;//流水编号
    private Integer OrderId;//订单编号
    private Double Monry;//

    //无参
    public UserStream() {
    }

    //有参
    public UserStream(Integer id, Integer orderId, Double monry) {
        this.id = id;
        OrderId = orderId;
        Monry = monry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer orderId) {
        OrderId = orderId;
    }

    public Double getMonry() {
        return Monry;
    }

    public void setMonry(Double monry) {
        Monry = monry;
    }
}
