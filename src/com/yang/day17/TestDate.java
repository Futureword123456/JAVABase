package com.yang.day17;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());
        System.out.println(date.getTime());
        System.out.println();
        Date date1 = new Date(5000);
        System.out.println(date1);
    }
}
