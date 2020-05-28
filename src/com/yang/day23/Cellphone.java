package com.yang.day23;

public class Cellphone extends Telphone {
    @Override
    public void call() {
        System.out.println("通过键盘打电话");
    }

    @Override
    public void message() {
        System.out.println("通过键盘发短信");
    }
}
