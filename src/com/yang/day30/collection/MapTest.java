package com.yang.day30.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    /*
    装学生类型对象
     */
    public Map<String, Student> students;

    /*
    添加构造方法初始化student
     */
    public MapTest() {
        this.students = new HashMap<String, Student>();
    }

    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        mapTest.testPut();
        mapTest.testKeySet();
    }

    /*
    测试添加：输入id，根据id查找
     */
    public void testPut() {
        ///创建一个scanner
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID:");
            String ID = scanner.next();
            //判断输入的id是否被占用
            Student st = students.get(ID);
            if (st == null) {
                System.out.println("请输入学生姓名");
                String name = scanner.next();
                //创建一个新的学生对象
                Student newstudent = new Student(ID, name);
                students.put(ID, newstudent);
                System.out.println("成功添加学生" + students.get(ID).name);
                i++;
            } else {
                System.out.println("学生id被占用");
                continue;
            }


        }

    }

    public void testKeySet() {
        //通过keyset，返回Map中所有键的集合
        Set<String> keySet = students.keySet();
        //获得map容量
        System.out.println("总共有" + students.size() + "个学生");
        //遍历keyset获得键，再调用get方法获得每个键
        for (String stuId : keySet) {
            Student student = students.get(stuId);
            if (student != null) {
                System.out.println("学生" + student.name);
            }
        }
    }
}
