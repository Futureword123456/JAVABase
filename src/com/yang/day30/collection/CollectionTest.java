package com.yang.day30.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionTest {
    public static void main(String[] args) {
        CollectionTest collectionTest = new CollectionTest();
        // collectionTest.testSort1();
        //collectionTest.testSort2();
        collectionTest.testSort3();
    }

    /**
     * 排序
     */
    public void testSort1() {
        List<Integer> integerList = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        //不重复
        for (int i = 0; i < 10; i++) {
            do {
                k = random.nextInt(100);
            } while (integerList.contains(k));
            integerList.add(k);
            System.out.println("成功添加" + k);

        }
        System.out.println("-----------排序前-----------");
        for (Integer integer : integerList) {
            System.out.println("元素" + integer);

        }
        Collections.sort(integerList);
        System.out.println("----------排序后------------");
        for (Integer integer : integerList) {
            System.out.println("元素" + integer);

        }

    }

    public void testSort3() {
        List<Student> studentList = new ArrayList<Student>();
        Random random = new Random();


        studentList.add(new Student(random.nextInt(1000) + "", "Mike"));
        studentList.add(new Student(random.nextInt(1000) + "", "Angela"));
        studentList.add(new Student(random.nextInt(1000) + "", "Lucy"));
        studentList.add(new Student(10000 + "", "Bey"));
        System.out.println("-------------排序前----------------------");
        for (Student student : studentList) {
            System.out.println("学生" + student.id + ":" + student.name);
        }
        Collections.sort(studentList);
        System.out.println("-------------排序后----------------------");
        for (Student student : studentList) {
            System.out.println("学生" + student.id + ":" + student.name);
        }
    }

    public void testSort2() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("microsoft");
        stringList.add("google");
        stringList.add("lenovo");
        System.out.println("-------------------排序前-------------");
        for (String string : stringList) {
            System.out.println("元素:" + string);
        }
        Collections.sort(stringList);
        System.out.println("-----------------排序后---------------");
        for (String string : stringList) {
            System.out.println("元素:" + string);
        }
    }
}
