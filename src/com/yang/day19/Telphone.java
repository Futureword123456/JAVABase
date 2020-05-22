package com.yang.day19;

public class Telphone {
    float screen;
    float cpu;
    float mem;

    public Telphone() {
        System.out.println("无参构造方法");
    }

    public Telphone(float newscreen, float newcpu, float newmem) {
        this.screen = newscreen;
        this.cpu = newcpu;
        this.mem = newmem;
        System.out.println("有参数方法");
    }
}
