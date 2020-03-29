package com.yang.day4;

//变量
public class HelloWorld {
    public static void main(String[] args) {
        int year = 1000;
        byte b = 1;
        short s = 200;
        int i = 300;
        long l = 400;
        byte b2 = (byte) 200;
        char c = '中';
        //char只能存放一个字符
        //char c1 = "中国";
        //char c3="jdhgcv";
        //float 长度为32位
        //double 长度为64位
        //注意： 默认的小数值是double类型的
        //所以 float f = 54.321会出现编译错误，因为54.321的默认类型是 double，其类型 长度为64，超过了float的长度32
        //在数字后面加一个字母f，直接把该数字声明成float类型
        double d = 123.45;
        //错误
        //float f=543.654;
        float f2 = 2165.561f;
        boolean b1 = true;
        boolean b3 = false;
        // 虽然布尔型真正存放的数据是0(false) 1(true)
        // 但是，不能直接使用0 1 进行赋值
        //boolean b4 = 1;
        String str = "helloworld";
        //作业:
        double a = 3.14;
        double a1 = 2.15445464;
        int a3 = 265;
        int a4 = 12;
        char a5 = '吃';
        boolean a6 = false;
        String a7 = "不可描述";


    }
}
