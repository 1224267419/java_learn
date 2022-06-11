package com.pagage.www;

public class Teacher {
    public static void main(String[] args) {
    Student p1=new Student();//必须新建对象才能用属性和方法
    p1.age=10;
    p1.sex=1;
    System.out.println(p1.age);
    p1.add_age();
    System.out.println(p1.age);
    p1.add_age(2);
        System.out.println(p1.age);
        p1.add_age10();
        System.out.println(p1.age);

    }
}