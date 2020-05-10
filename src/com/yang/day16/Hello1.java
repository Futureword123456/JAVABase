package com.yang.day16;

public class Hello1 {
    public static void main(String[] args) {
        System.out.println(Math.E);
        int n = Integer.MAX_VALUE;
        System.out.println(Math.pow(1 + 1d / n, n));
        String str1 = "the";

        StringBuffer sb = new StringBuffer(str1);

        System.out.println(sb.length()); //内容长度

        System.out.println(sb.capacity());//总空间
    }
}
