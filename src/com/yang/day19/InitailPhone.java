package com.yang.day19;

public class InitailPhone {
    public static void main(String[] args) {
        Telphoto telphoto = new Telphoto();
        telphoto.sendMesage();
        telphoto.screen = 5.0f;
        telphoto.cpu = 1.4f;
        telphoto.mem = 2.0f;
        telphoto.sendMesage();
        telphoto.call();
    }
}
