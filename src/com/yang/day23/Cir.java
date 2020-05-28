package com.yang.day23;

public class Cir extends MianjiandZhouchang {
    double r = 2;

    @Override
    public int Area() {
        return (int) (Math.PI * r * r);
    }

    @Override
    public int Circle() {
        return (int) (2 * Math.PI * r);
    }
}
