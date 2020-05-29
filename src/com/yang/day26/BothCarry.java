package com.yang.day26;

public class BothCarry extends Car {
    private int personNum;
    private int goodsNum;

    public BothCarry() {
        this.personNum = 0;
        this.goodsNum = 0;
        this.name = "";
        this.price = 0;
    }

    public BothCarry(int price, int personNum,
                     int goodsNum, String name) {
        this.personNum = personNum;
        this.goodsNum = goodsNum;
        this.price = price;
        this.name = name;
    }

    public int getPersonNum() {
        return personNum;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

}
