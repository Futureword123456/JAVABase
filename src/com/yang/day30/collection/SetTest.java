package com.yang.day30.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
    public List<Course> courseToSelect;
    public Student student;
    private Scanner scanner;

    public SetTest() {
        courseToSelect = new ArrayList<Course>();
        scanner = new Scanner(System.in);

    }

    public static void main(String[] args) {
        SetTest setTest = new SetTest();
        setTest.testAdd();
        setTest.testListContains();

        setTest.testForEach();
//        setTest.createStudnetAndSelect();
//        setTest.testSetContains();
//        setTest.testforecah();
//        //Student student = new Student(2, "小明");
//        //System.out.println("欢同欢迎" + student.name + "学选课");
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("请输入课程id");
//            String courseid = scanner.next();
//            for (Course cr : setTest.courseToSelect) {
//                if (cr.id.equals(courseid)) {
//                    // student.courses.add(cr);
//                    /**
//                     * Set中，添加某个对象，无论添加多少次， 最终只会保留一个该对象（的引用）， 并且，保留的是第一次添加的那一个
//                     */
//                    //student.courses.add(null);
//                    //student.courses.add(cr);
//                }
//
//            }
//
//        }
        //输出课程
        //setTest.testForEachSet(student);

    }

    //创建学生对象并选课
    public void createStudentAndSelect() {

        student = new Student("2", "小明");
        System.out.println("欢同欢迎" + student.name + "学选课");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入课程id");
            String courseid = scanner.next();
            for (Course cr : courseToSelect) {
                if (cr.id.equals(courseid)) {
                    // student.courses.add(cr);
                    /**
                     * Set中，添加某个对象，无论添加多少次， 最终只会保留一个该对象（的引用）， 并且，保留的是第一次添加的那一个
                     */
                    //student.courses.add(null);
                    //student.courses.add(cr);
                }

            }

        }
    }

//    /*
//    测试Set
//     */
//    public void testSetContains() {
//
//    }

    public void createStudnetAndSelect() {

        student = new Student("1", "小明");
        System.out.println("欢同欢迎" + student.name + "学选课");

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入课程id");
            String courseid = scanner.next();
            for (Course cr : courseToSelect) {
                if (cr.id.equals(courseid)) {
                    // student.courses.add(cr);
                    /**
                     * Set中，添加某个对象，无论添加多少次， 最终只会保留一个该对象（的引用）， 并且，保留的是第一次添加的那一个
                     */
                    //student.courses.add(null);
                    //student.courses.add(cr);
                }

            }

        }
    }

    /*
    测试contains
     */

    /**
     * 测试Set的contains方法
     */
    public void testSetContains() {
        // 提示输入课程名称
        System.out.println("请输入学生已选的课程名称：");
        String name = scanner.next();
        // 创建一个新的课程对象，ID和名称，与course对象完全一样
        Course course2 = new Course();
        course2.name = name;
        System.out.println("新创建课程：" + course2.name);
        System.out.println("备选课程中是否包含课程：" + course2.name + ", " +
                student.courses.contains(course2));
    }

    public void testListContains() {
        Course course = courseToSelect.get(0);
        System.out.println("取得课程" + course.name);
        System.out.println("备选课程中是否包含" + course.name + "," + courseToSelect.contains(course));
        //创建一个课程对象 ID和名称
        //输入课程名称
        System.out.println("输入从名称:");
        String name = scanner.next();
        Course course2 = new Course();
        course2.name = name;

        Course course1 = new Course(course.id, course.name);
        System.out.println("新创建课程：" + course1.name);
        System.out.println("备选课程中是否包含" + course1.name + "," + courseToSelect.contains(course1));
        if (courseToSelect.contains(course2)) {
            System.out.println("课程" + course2.name + "索引位置是:" + courseToSelect.indexOf(course2));
        }
    }

    public void testForEachSet(Student student) {
        System.out.println("共选择了：" + student.courses.size() + "门课程！");
        for (Course cr : student.courses) {
            System.out.println("选择的课程:" + cr.id + ":" + cr.name);

        }
    }

    public void testAdd() {
        //创建一个课程对象并通过调用add方法，添加课程
        Course course = new Course("1", "数据结构");
        courseToSelect.add(course);
        Course temp = (Course) courseToSelect.get(0);
        // System.out.println("添加课程：" + temp.id + ":" + temp.name);

//        Course course1 = new Course("2", "c语言");
//        courseToSelect.add(0, course1);
//        Course temp2 = (Course) courseToSelect.get(0);
//        System.out.println("添加课程：" + temp2.id + ":" + temp2.name);


        courseToSelect.add(course);
        Course temp0 = (Course) courseToSelect.get(1);
        // System.out.println("添加课程：" + temp.id + ":" + temp.name);

//        Course course2 = new Course("3", "test");
//        courseToSelect.add(4, course2);
        Course[] course3 = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        courseToSelect.addAll(Arrays.asList(course3));
        Course temp3 = (Course) courseToSelect.get(2);
        Course temp4 = (Course) courseToSelect.get(3);
        // System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + temp4.id + ":" + temp4.name);

        Course[] courses = {new Course("5", "高等数学"), new Course("6", "英语")};
        courseToSelect.addAll(2, Arrays.asList(courses));
        Course temp5 = (Course) courseToSelect.get(2);
        Course temp6 = (Course) courseToSelect.get(3);
        // System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + temp6.id + ":" + temp6.name);


    }

    /* 通过for each方法访问集合元素
     * @param args
     */
    public void testForEach() {
        System.out.println("有如下课程待选(通过for each访问)：");
        for (Object obj : courseToSelect) {
            Course cr = (Course) obj;
            System.out.println("课程：" + cr.id + ":" + cr.name);
        }
    }
}
