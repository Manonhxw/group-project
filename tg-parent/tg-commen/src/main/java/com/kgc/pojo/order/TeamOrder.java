package com.kgc.pojo.order;

/**
 * 团购订单
 */
public class TeamOrder {
    private Integer teamId; //团购订单id
    private Integer goodsId; //商品id
    private Integer leaderId; //团长id
    private Integer orderType; //订单类型
    private Integer goodsNumber; //商品剩余数量
    private Integer quota; //限购量

    public TeamOrder() {
    }

    public TeamOrder(Integer teamId, Integer goodsId, Integer leaderId, Integer orderType, Integer goodsNumber, Integer quota) {
        this.teamId = teamId;
        this.goodsId = goodsId;
        this.leaderId = leaderId;
        this.orderType = orderType;
        this.goodsNumber = goodsNumber;
        this.quota = quota;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }
}
