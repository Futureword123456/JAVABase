package com.yang.day30.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    /*
    泛型Course
     */
    public List<Course> courses;

    public TestGeneric() {
        this.courses = new ArrayList<Course>();
    }

    public static void main(String[] args) {
        TestGeneric testGeneric = new TestGeneric();
        testGeneric.testAdd();
        testGeneric.testForEach();

        testGeneric.tesChild();
        testGeneric.testForEach();

        testGeneric.testBaseType();


    }

    /*
    泛型不能使用基本类型
     */
    public void testBaseType() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println("基本类型的包装类作为泛型" + list.get(0));

    }

    public void testAdd() {
        Course course = new Course("1", "大学英语");
        courses.add(course);
        //泛型集合中不能添加泛型集合以外的东西，否则报错
        //courses.add("rtdfyguhij");
        Course course1 = new Course("2", "java基础");
        courses.add(course1);

    }

    /*
    循环遍历方法
     */
    public void testForEach() {
        for (Course cr : courses) {
            System.out.println(cr.id + ":" + cr.name);
        }
    }

    /*
    测试泛型集合乐意添加泛型的子类型的实列
     */
    public void tesChild() {
        ChildCourse childCourse = new ChildCourse();
        childCourse.id = "10";
        childCourse.name = "我是子类型的实例";
        courses.add(childCourse);
    }

}
