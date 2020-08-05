package com.kgc.pojo.order;

/**
 * 零售订单
 */
public class RetailOrder {
    private Integer retailId;// 零售id
    private Integer leaderId;// 团长id
    private Integer userId; //用户id
    private Integer goodsId; //商品id
    private Integer goodsNumber; //商品数量
    private Double sumMoney; //总金额
    private String orderTime; //下单时间
    private Integer orderState; //订单状态
    private String endPayTime;// 付款时间
    private Integer orderType; //团购类型

    public RetailOrder() {
    }

    public RetailOrder(Integer retailId, Integer leaderId, Integer userId, Integer goodsId, Integer goodsNumber, Double sumMoney, String orderTime, Integer orderState, String endPayTime, Integer orderType) {
        this.retailId = retailId;
        this.leaderId = leaderId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.goodsNumber = goodsNumber;
        this.sumMoney = sumMoney;
        this.orderTime = orderTime;
        this.orderState = orderState;
        this.endPayTime = endPayTime;
        this.orderType = orderType;
    }

    public Integer getRetailId() {
        return retailId;
    }

    public void setRetailId(Integer retailId) {
        this.retailId = retailId;
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
