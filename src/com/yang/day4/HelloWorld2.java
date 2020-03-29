package com.yang.day4;

public class HelloWorld2 {
    public static void main(String[] args) {
        char c = 'A';
        short s = 80;
        c = (char) s;
        s = (short) c;
        long l = 50;
        int i = 50;
        l = i;
        i = (int) l;
        byte b = 5;
        int i1 = 10;
        int i2 = 300;

        b = (byte) i1;
        //因为i1的值是在byte范围之内，所以即便进行强制转换
        //最后得到的值，也是10
        System.out.println(b);

        //因为i2的值是在byte范围之外，所以就会按照byte的长度进行截取
        //i2的值是300，其对应的二进制数是 100101100
        //按照byte的长度8位进行截取后，其值为 00101100 即44
        b = (byte) i2;
        System.out.println(b);

        //查看一个整数对应的二进制的方法：
        System.out.println(Integer.toBinaryString(i2));
        //作业:
        short a = 1;
        short b1 = 2;
        int c1 = a + b1;
        System.out.println(c1);


    }

}
