package com.yang.day19;

public class Telphoto {
    //属性（成员变量）
    float screen;
    float cpu;
    float mem;
    int var = 30;

    //方法
    void call() {
        int localVar = 0;
        int var = 40;
        System.out.println("localVar" + localVar);
        System.out.println("Telphoto有打电话的功能!");
        System.out.println("var：" + var);
    }

    void sendMesage() {
        //System.out.println("localVar"+localVar);
        System.out.println("var：" + var);
        System.out.println("screen" + screen + "cpu" + cpu + "mem" + mem + "能发短信!");
    }

}
