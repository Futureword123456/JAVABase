package com.yang.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Hello {
    public static void main(String[] args) {
        File file = new File("G:/JAVA");
        FileInputStream fileInputStream = null;
        try {
            System.out.println("试图打开java文件");
            fileInputStream = new FileInputStream(file);
            System.out.println("打开成功！！");
        } catch (FileNotFoundException e) {
            System.out.println("java文件不存在");
            e.printStackTrace();
        }
        System.out.println(fileInputStream);

    }
}
