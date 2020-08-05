package com.kgc.pojo.leader;

import java.io.Serializable;

/**
 * 团长收支表
 */
public class Leader_shouzhi implements Serializable {
    //收支表id
    private Integer id;
    //收支金额
    private double shouzhi;
    //收支时间
    private String time;

    public Leader_shouzhi() {
    }

    public Leader_shouzhi(Integer id, double shouzhi, String time) {
        this.id = id;
        this.shouzhi = shouzhi;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getShouzhi() {
        return shouzhi;
    }

    public void setShouzhi(double shouzhi) {
        this.shouzhi = shouzhi;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
