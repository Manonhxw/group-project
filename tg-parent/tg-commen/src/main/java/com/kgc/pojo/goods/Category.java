package com.kgc.pojo.goods;

public class Category {
    private int categoryid;//  序号
    private String TYPE;//  商品种类

    public Category(){}
    public Category(int categoryid, String TYPE) {
        this.categoryid = categoryid;
        this.TYPE = TYPE;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }
}
