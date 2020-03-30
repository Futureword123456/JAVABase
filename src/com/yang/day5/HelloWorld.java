package com.yang.day5;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int a = i + j;
        int b = i - j;
        int c = i * j;
        int d = i / j;
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        System.out.println("第一个数是：" + e);
        int e1 = scanner.nextInt();
        System.out.println("第二个数是：" + e1);
        System.out.println("两个数的和是:" + (e + e1));
        //%表示取余
        System.out.println(i % j);
        int j1 = ++i + i++ + ++i + ++i + i++;
        System.out.println(j1);
    }
}
