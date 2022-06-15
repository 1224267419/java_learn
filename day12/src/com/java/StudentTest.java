package com.java;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student("math");
        Person p1=new Person();
        p1.eat();
        s1.eat();//正常的方法重写

        s1.walk(10);
        s1.learn();
        //s1.walk();//子类不能重写父类中声明为private权限的方法

    }
}
