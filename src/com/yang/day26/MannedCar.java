package com.yang.day26;

public class MannedCar extends Car {
    private int personNum;

    public MannedCar() {
        this.personNum = 0;
        this.price = 0;
        this.name = "";
    }

    public MannedCar(int personNum, int price, String name) {
        this.personNum = personNum;
        this.price = price;
        this.name = name;
    }

    public int getPersonNum() {
        return personNum;
    }
}
