package com.kgc.pojo.order;

/**
 * 订单状态
 */
public class OrderState {
    private Integer stateId;// 订单状态id
    private String state;// 订单状态

    public OrderState() {
    }

    public OrderState(Integer stateId, String state) {
        this.stateId = stateId;
        this.state = state;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
