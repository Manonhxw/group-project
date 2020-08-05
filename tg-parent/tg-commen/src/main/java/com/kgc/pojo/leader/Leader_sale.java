package com.kgc.pojo.leader;

import java.io.Serializable;

/**
 * 团长业绩表
 */
public class Leader_sale implements Serializable {
    //业绩信息表id
    private Integer id;
    //今日提成
    private double ticheng;
    //今日订单数
    private Integer dingdan;
    //几日销售额
    private double salemoney;

    public Leader_sale() {
    }

    public Leader_sale(Integer id, double ticheng, Integer dingdan, double salemoney) {
        this.id = id;
        this.ticheng = ticheng;
        this.dingdan = dingdan;
        this.salemoney = salemoney;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getTicheng() {
        return ticheng;
    }

    public void setTicheng(double ticheng) {
        this.ticheng = ticheng;
    }

    public Integer getDingdan() {
        return dingdan;
    }

    public void setDingdan(Integer dingdan) {
        this.dingdan = dingdan;
    }

    public double getSalemoney() {
        return salemoney;
    }

    public void setSalemoney(double salemoney) {
        this.salemoney = salemoney;
    }
}
