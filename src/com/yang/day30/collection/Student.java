package com.yang.day30.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
学生类
 */
public class Student implements Comparable<Student> {
    public String id;
    public String name;
    //public Set Courses;
    public Set<Course> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id.equals(student.id) &&
                name.equals(student.name) &&
                courses.equals(student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, courses);
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
