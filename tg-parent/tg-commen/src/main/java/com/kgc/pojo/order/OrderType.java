package com.kgc.pojo.order;

/**
 * 订单类型
 */
public class OrderType {
    private Integer typeId;// 订单类型id
    private String orderType;//订单类型

    public OrderType() {
    }

    public OrderType(Integer typeId, String orderType) {
        this.typeId = typeId;
        this.orderType = orderType;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
