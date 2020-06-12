package com.yang.day30.collection;

import java.util.HashSet;
import java.util.Set;

/*
学生类
 */
public class Student {
    public int id;
    public String name;
    //public Set Courses;
    public Set<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }
}
