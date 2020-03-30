package com.yang.day5;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        System.out.println("请输入身高：(单位m)");
        Scanner scanner = new Scanner(System.in);
        float high = scanner.nextFloat();
        System.out.println("请输入体重：(单位kg)");
        float weight = scanner.nextFloat();
        double bmi = weight / (high * high);
        System.out.println("当前的BMI是：" + bmi);
        if (bmi < 18.5) {
            System.out.println("体重过轻！！");
        }
        if (bmi >= 18.5 && bmi < 24) {
            System.out.println("正常范围！！！");
        }
        if (bmi >= 24 && bmi < 27) {
            System.out.println("体重过重！！");
        }
        if (bmi >= 27 && bmi < 30) {
            System.out.println("轻度肥胖！！");
        }
        if (bmi >= 30 && bmi < 35) {
            System.out.println("中度肥胖！！");
        }
        if (bmi >= 24) {
            System.out.println("重度肥胖！！");
        }

    }
}
