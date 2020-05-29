package com.yang.day26;

public abstract class Car {
    public int price;
    public String name;

    public int goodsNum;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonNum() {
        return 0;
    }

    public int getGoodsNum() {
        return 0;
    }
}
