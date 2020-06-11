package com.yang.day30.collection;

import java.util.HashSet;
import java.util.Set;

/*
学生类
 */
public class Student {
    public String id;
    public String name;
    public Set Courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.Courses = new HashSet();
    }
}
