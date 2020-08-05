package com.kgc.pojo.user;

import java.io.Serializable;

public class Member implements Serializable {
    private Integer UserId;//用户编号
    private String nickname;//昵称
    private String PassWord;//密码
    private String UserName;//用户姓名
    private Integer UserAge;//年龄
    private String UserAddress;//住址
    private String UserPhone;//手机号
    private String Card;//身份证
    private Integer UserVIP;//是否为VIP
    private String UserCreateTime;//注册时间
    private Integer CloenelId;//团长编号

    //无参
    public Member() {
    }

    //有参
    public Member(Integer userId, String nickname, String passWord, String userName, Integer userAge, String userAddress, String userPhone, String card, Integer userVIP, String userCreateTime, Integer cloenelId) {
        UserId = userId;
        this.nickname = nickname;
        PassWord = passWord;
        UserName = userName;
        UserAge = userAge;
        UserAddress = userAddress;
        UserPhone = userPhone;
        Card = card;
        UserVIP = userVIP;
        UserCreateTime = userCreateTime;
        CloenelId = cloenelId;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
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

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getUserAge() {
        return UserAge;
    }

    public void setUserAge(Integer userAge) {
        UserAge = userAge;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public Integer getUserVIP() {
        return UserVIP;
    }

    public void setUserVIP(Integer userVIP) {
        UserVIP = userVIP;
    }

    public String getUserCreateTime() {
        return UserCreateTime;
    }

    public void setUserCreateTime(String userCreateTime) {
        UserCreateTime = userCreateTime;
    }

    public Integer getCloenelId() {
        return CloenelId;
    }

    public void setCloenelId(Integer cloenelId) {
        CloenelId = cloenelId;
    }
}
