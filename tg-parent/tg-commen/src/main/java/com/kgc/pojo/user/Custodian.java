package com.kgc.pojo.user;

import java.io.Serializable;

public class Custodian implements Serializable {
    private Integer CustId;//管理员编号
    private String CustName;//昵称
    private String PassWord;//密码
    private Integer GoodsInfo;//管理商品信息权限
    private Integer UserInfo;//用户信息权限
    private Integer OrderInfo;//订单信息权限
    private Integer FundInfo;//资金信息权限

    //无参
    public Custodian() {
    }

    //有参
    public Custodian(Integer custId, String custName, String passWord, Integer goodsInfo, Integer userInfo, Integer orderInfo, Integer fundInfo) {
        CustId = custId;
        CustName = custName;
        PassWord = passWord;
        GoodsInfo = goodsInfo;
        UserInfo = userInfo;
        OrderInfo = orderInfo;
        FundInfo = fundInfo;
    }

    public Integer getCustId() {
        return CustId;
    }

    public void setCustId(Integer custId) {
        CustId = custId;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public Integer getGoodsInfo() {
        return GoodsInfo;
    }

    public void setGoodsInfo(Integer goodsInfo) {
        GoodsInfo = goodsInfo;
    }

    public Integer getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(Integer userInfo) {
        UserInfo = userInfo;
    }

    public Integer getOrderInfo() {
        return OrderInfo;
    }

    public void setOrderInfo(Integer orderInfo) {
        OrderInfo = orderInfo;
    }

    public Integer getFundInfo() {
        return FundInfo;
    }

    public void setFundInfo(Integer fundInfo) {
        FundInfo = fundInfo;
    }
}
