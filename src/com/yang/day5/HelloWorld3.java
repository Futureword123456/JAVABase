package com.yang.day5;

import java.util.Scanner;

public class HelloWorld3 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int g = 1;
        while (a > 0) {
            g = g * a;
            a--;
        }
        System.out.println(g);


    }
}
