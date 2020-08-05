package com.kgc.pojo.leader;

import java.io.Serializable;

/**
 * 团长佣金表
 */
public class Leader_yongjin implements Serializable {
    //佣金id
    private Integer id;
    //团长id
    private Integer leaderId;
    //账号余额
    private double balance;
    //已提余额
    private double Lastcharges;


    public Leader_yongjin() {
    }

    public Leader_yongjin(Integer id, Integer leaderId, double balance, double lastcharges) {
        this.id = id;
        this.leaderId = leaderId;
        this.balance = balance;
        Lastcharges = lastcharges;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLastcharges() {
        return Lastcharges;
    }

    public void setLastcharges(double lastcharges) {
        Lastcharges = lastcharges;
    }
}
