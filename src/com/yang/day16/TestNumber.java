package com.yang.day16;

public class TestNumber {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int i = 5;
        String s = String.valueOf(i);
        System.out.println(s);

        Integer it = i;
        String str = it.toString();
        System.out.println(str);
        String str1 = "9999";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1);

        float s1 = (float) 3.14;
        String s2 = String.valueOf(s1);
        System.out.println(s2);
        String s4 = "3.14";
        float s3 = Float.parseFloat(s4);
        System.out.println(s3);


    }
}
