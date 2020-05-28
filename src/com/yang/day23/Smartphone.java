package com.yang.day23;

public class Smartphone extends Telphone {
    @Override
    public void call() {
        System.out.println("通过语音打电话");
    }

    @Override
    public void message() {
        System.out.println("通过语言发短信");
    }
}
