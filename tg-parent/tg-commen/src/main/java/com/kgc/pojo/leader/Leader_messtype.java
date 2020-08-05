package com.kgc.pojo.leader;

import java.io.Serializable;

/**
 * 团长信息分类表
 */
public class Leader_messtype implements Serializable {
    //分类id
    private Integer id;
    //分类名
    private String type;

    public Leader_messtype() {
    }

    public Leader_messtype(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
