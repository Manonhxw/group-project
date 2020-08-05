package com.kgc.pojo.goods;

public class Goods {
    private int goodsid;// 商品表id
    private String goodsname;// 商品名
    private String TYPE;// 商品种类
    private int price;// 单价
    private int stock;// 库存
    private String beizhu;// 备注
    private Integer cateid;// 商品分类表id
    private double moneyrate ;//每件商品给团长的利润
    private Category category;

    public Goods(){}
    public Goods(int goodsid, String goodsname, String TYPE, int price, int stock, String beizhu, Integer cateid, Category category,
        double moneyrate
    ) {
        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.TYPE = TYPE;
        this.price = price;
        this.stock = stock;
        this.beizhu = beizhu;
        this.cateid = cateid;
        this.category = category;
        this.moneyrate=moneyrate;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getMoneyrate() {
        return moneyrate;
    }

    public void setMoneyrate(double moneyrate) {
        this.moneyrate = moneyrate;
    }
}
