package com.yang.day30.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
备选课程
 */
public class ListTest {
    public List courseToSelect;

    public ListTest() {
        this.courseToSelect = new ArrayList();
    }

    public static void main(String[] args) {
        ListTest listTest = new ListTest();
        listTest.testAdd();
        listTest.getList();
        listTest.testiterator();
        listTest.testforecah();
        listTest.testModify();
        listTest.testforecah();
        listTest.testRemove();
        listTest.testType();
    }

    /*
    添加一些奇怪数据
     */
    public void testType() {
        System.out.println("能否网list添加一些东西");
        //courseToSelect.add("我不是课程，我只是一个无辜的字符串！！");
        //testforecah();
    }

    /*
    删除课程
     */
    public void testRemove() {
        //Course course = (Course) courseToSelect.get(4);
        System.out.println("即将删除4位置上和5位置课程");
        Course[] courses = {(Course) courseToSelect.get(4), (Course) courseToSelect.get(5)};
        courseToSelect.removeAll(Arrays.asList(courses));
        //courseToSelect.remove(4);
        System.out.println("成功删除课程");
        testforecah();
    }

    /*
    修改课程
     */
    public void testModify() {
        courseToSelect.set(4, new Course("7", "计算机"));

    }

    /*
    通过迭代器遍历
     */
    public void testiterator() {
        System.out.println("有如下课程可选(通过迭代器返回)");
        Iterator iterator = courseToSelect.iterator();
        while (iterator.hasNext()) {
            Course course = (Course) iterator.next();
            System.out.println("课程" + course.id + ":" + course.name);

        }
    }

    public void testAdd() {
        //创建一个课程对象并通过调用add方法，添加课程
        Course course = new Course("1", "数据结构");
        courseToSelect.add(course);
        Course temp = (Course) courseToSelect.get(0);
        System.out.println("添加课程：" + temp.id + ":" + temp.name);

        Course course1 = new Course("2", "c语言");
        courseToSelect.add(0, course1);
        Course temp2 = (Course) courseToSelect.get(0);
        System.out.println("添加课程：" + temp2.id + ":" + temp2.name);


        courseToSelect.add(course);
        Course temp0 = (Course) courseToSelect.get(2);
        System.out.println("添加课程：" + temp.id + ":" + temp.name);

//        Course course2 = new Course("3", "test");
//        courseToSelect.add(4, course2);
        Course[] course3 = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        courseToSelect.addAll(Arrays.asList(course3));
        Course temp3 = (Course) courseToSelect.get(3);
        Course temp4 = (Course) courseToSelect.get(4);
        System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + temp4.id + ":" + temp4.name);

        Course[] courses = {new Course("5", "高等数学"), new Course("6", "英语")};
        courseToSelect.addAll(2, Arrays.asList(courses));
        Course temp5 = (Course) courseToSelect.get(2);
        Course temp6 = (Course) courseToSelect.get(3);
        System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + temp6.id + ":" + temp6.name);

    }

    /*
    取得list元素
     */
    public void getList() {
        int size = courseToSelect.size();
        System.out.println("有如下课程可选");
        for (int i = 0; i < size; i++) {
            Course cr = (Course) courseToSelect.get(i);
            System.out.println("课程" + cr.id + ":" + cr.name);
        }
    }

    /*
    foreach方法
     */
    public void testforecah() {
        System.out.println("有如下课程可选(forecch)");
        for (Object o : courseToSelect) {
            Course course = (Course) o;
            System.out.println("课程" + course.id + ":" + course.name);

        }
    }
}
