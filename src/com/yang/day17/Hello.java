package com.yang.day17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        System.out.println(str);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd ");
        Date date1 = new Date();
        String str1 = simpleDateFormat1.format(date1);
        System.out.println(str1);
    }
}
