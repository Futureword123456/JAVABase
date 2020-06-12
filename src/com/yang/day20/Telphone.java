package com.yang.day20;

public class Telphone {
    float mem;
    private float screen;
    private float cpu;

    public Telphone() {
        System.out.println("无参构造方法");
    }

    public Telphone(float screen, float cpu, float mem) {
        this.screen = screen;
        this.cpu = cpu;
        this.mem = mem;
        System.out.println("有参数的构造方法执行了");
    }

    public void sendMessage() {
        System.out.println("发送信息");
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float newscreen) {
        this.screen = newscreen;
    }

    public float getMem() {
        return mem;
    }

    public void setMem(float mem) {
        this.mem = mem;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }
}
