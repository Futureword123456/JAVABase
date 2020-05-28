package com.yang.day23;

public class Initail {
    public static void main(String[] args) {
        Telphone telphone = new Cellphone();
        telphone.call();
        telphone.message();
        Telphone telphone1 = new Smartphone();
        telphone1.call();
        telphone.message();
    }
}
