package com.yang.day26;

public class Truck extends Car {
    private int goodsNum;

    public Truck() {
        this.price = 0;
        this.goodsNum = 0;
        this.name = "";
    }

    public Truck(int price, int goodsNum, String name) {
        this.price = price;
        this.goodsNum = goodsNum;
        this.name = name;
    }

    @Override
    public int getGoodsNum() {
        return goodsNum;
    }

}
