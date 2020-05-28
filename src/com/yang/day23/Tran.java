package com.yang.day23;

public class Tran extends MianjiandZhouchang {
    double c = 4;
    double k = 5;

    @Override
    public int Area() {
        return (int) (c * k);
    }

    @Override
    public int Circle() {
        return (int) (2 * (c + k));
    }
}
