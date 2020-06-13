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
//        mapTest.testRemove();
////        mapTest.testEntrySet();
//        mapTest.testModify();
//        mapTest.testEntrySet();
        mapTest.testContainsKeyOrValue();
    }

    /*
    测试修改
     */
    public void testModify() {
        System.out.println("请输入要修改的学生ID");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //取得键盘输入的学生ID
            String ID = scanner.next();

            //根据i的查找学生id
            Student student = students.get(ID);
            if (student == null) {
                System.out.println("学生id不存在，请重新输入");
                continue;
            }
            System.out.println("当前改学生ID是对应学生是" + student.name);
            System.out.println("请输入新的学生姓名");
            String name = scanner.next();
            Student student1 = new Student(ID, name);
            students.put(ID, student1);
            System.out.println("修改成功！！");
            break;
        }
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

    /*
    删除学生id
     */
    public void testRemove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除的学生id");
            String ID = scanner.next();
            //判断id是否有对应的学生对象
            Student st = students.get(ID);
            if (st == null) {
                System.out.println("ID不存在");
                continue;
            }
            students.remove(ID);
            System.out.println("成功删除学生" + st.name);
            break;
        }
    }

    /*
    通过enterySet方法遍历MAP
     */
    public void testEntrySet() {
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            System.out.println("取得键" + entry.getKey());
            System.out.println("对应的值是" + entry.getValue().name);

        }
    }

    /**
     * 测试Map中是否包含key或value值
     */
    public void testContainsKeyOrValue() {
        System.out.println("请输入学生ID");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        System.out.println("你输入的学生ID为" + id + "在学生映射表中" + students.containsKey(id));
        if (students.containsKey(id)) {
            System.out.println("对应的学生为" + students.get(id).name);
        }
//提示输入学生姓名
        System.out.println("请输入要查询的学生姓名");
        String name = scanner.next();
        if (students.containsValue(new Student(null, name))) {
            System.out.println("在学生映射表中包含学生的姓名" + name);
        } else {
            System.out.println("不存在这样的学生");
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
