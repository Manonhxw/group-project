package com.kgc.pojo.user;

import java.io.Serializable;

public class Leader implements Serializable {
    private Integer LeaderId;//团长编号
    private String nickname;//昵称
    private String PassWord;//密码
    private String LeaaderName ;//团长姓名
    private Integer LeaderAge ;//年龄
    private String LeaderAddress ;//住址
    private String LeaderPhone ;//手机号
    private String Card;//身份证
    private String LeaderArea ;//负责区域

    //无参
    public Leader() {
    }

    //有参
    public Leader(Integer leaderId, String nickname, String passWord, String leaaderName, Integer leaderAge, String leaderAddress, String leaderPhone, String card, String leaderArea) {
        LeaderId = leaderId;
        this.nickname = nickname;
        PassWord = passWord;
        LeaaderName = leaaderName;
        LeaderAge = leaderAge;
        LeaderAddress = leaderAddress;
        LeaderPhone = leaderPhone;
        Card = card;
        LeaderArea = leaderArea;
    }

    public Integer getLeaderId() {
        return LeaderId;
    }

    public void setLeaderId(Integer leaderId) {
        LeaderId = leaderId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getLeaaderName() {
        return LeaaderName;
    }

    public void setLeaaderName(String leaaderName) {
        LeaaderName = leaaderName;
    }

    public Integer getLeaderAge() {
        return LeaderAge;
    }

    public void setLeaderAge(Integer leaderAge) {
        LeaderAge = leaderAge;
    }

    public String getLeaderAddress() {
        return LeaderAddress;
    }

    public void setLeaderAddress(String leaderAddress) {
        LeaderAddress = leaderAddress;
    }

    public String getLeaderPhone() {
        return LeaderPhone;
    }

    public void setLeaderPhone(String leaderPhone) {
        LeaderPhone = leaderPhone;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public String getLeaderArea() {
        return LeaderArea;
    }

    public void setLeaderArea(String leaderArea) {
        LeaderArea = leaderArea;
    }
}
