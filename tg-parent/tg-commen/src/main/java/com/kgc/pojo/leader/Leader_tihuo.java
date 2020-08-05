package com.kgc.pojo.leader;

import java.io.Serializable;

/**
 * 提货记录表
 */
public class Leader_tihuo implements Serializable {
    //提货订单id
    private Integer id;
    //订单id
    private Integer orderId;
    //提货时间
    private String tiem;

    public Leader_tihuo() {
    }

    public Leader_tihuo(Integer id, Integer orderId, String tiem) {
        this.id = id;
        this.orderId = orderId;
        this.tiem = tiem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getTiem() {
        return tiem;
    }

    public void setTiem(String tiem) {
        this.tiem = tiem;
    }
}
