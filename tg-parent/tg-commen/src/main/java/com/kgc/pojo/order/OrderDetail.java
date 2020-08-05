package com.kgc.pojo.order;

/**
 * 团购订单详情
 */
public class OrderDetail {
    private Integer orderId;// 订单id
    private Integer userId;// 用户id
    private Integer leaderId;// 团长id
    private Integer goodsId;// 商品id
    private Integer goodsNumber;// I购买数量
    private Double sumMoney;// 总金额
    private String orderTime;// 下单时间
    private Integer orderState;// 订单状态
    private String endPayTime;// 付款时间
    private Integer orderType;// 团购类型

    public OrderDetail() {
    }

    public OrderDetail(Integer orderId, Integer userId, Integer leaderId, Integer goodsId, Integer goodsNumber, Double sumMoney, String orderTime, Integer orderState, String endPayTime, Integer orderType) {
        this.orderId = orderId;
        this.userId = userId;
        this.leaderId = leaderId;
        this.goodsId = goodsId;
        this.goodsNumber = goodsNumber;
        this.sumMoney = sumMoney;
        this.orderTime = orderTime;
        this.orderState = orderState;
        this.endPayTime = endPayTime;
        this.orderType = orderType;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(Double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getEndPayTime() {
        return endPayTime;
    }

    public void setEndPayTime(String endPayTime) {
        this.endPayTime = endPayTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
}
