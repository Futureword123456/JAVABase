package com.yang.day4;

public class HelloWorld3 {
    int i3 = 1;
    int j = i3;

    public void method1() {
        System.out.println(13);
    }

    public void method2() {
        System.out.println(i3);
    }

    public void method3(int i) {
        System.out.println(i);
    }

    public void method4() {
        //System.out.println(i);
    }

    //int j5=i;
    public void method5() {
        int i5 = 8;
        System.out.println(i5);
        {
            System.out.println(i5);
            int j = 6;
            System.out.println(j);
        }
        System.out.println(j);
    }

    int l = 1;

    public void method6(int i) {
        System.out.println(l);
    }

    public static void main(String[] args) {
        new HelloWorld3().method6(5);
    }
}
