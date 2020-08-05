package com.kgc.pojo.leader;

import java.io.Serializable;

/**
 * 团长消息表
 */
public class Leader_mess implements Serializable {
    //消息id
    private Integer id;
    //消息内容
    private String mess;

    public Leader_mess() {
    }

    public Leader_mess(Integer id, String mess) {
        this.id = id;
        this.mess = mess;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
