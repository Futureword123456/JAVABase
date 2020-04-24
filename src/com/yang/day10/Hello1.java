package com.yang.day10;

public class Hello1 {
    String name;
    float hp;
    int MoveSpeed;

    public static void main(String[] args) {
        Hello1 hello1 = new Hello1();
        new Hello1();
        Hello1 h1=hello1;
        Hello1 h2=hello1;
        Hello1 h3=hello1;
        Hello1 h5=h3;
        //Hello1=new Hello1();


    }

}
