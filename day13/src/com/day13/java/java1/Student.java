package com.day13.java.java1;

public class Student extends Person{

    int age=1;

    public Student() {
            age=10;
    }

    public Student(int age, String name, int sex, int age1) {
        super(age, name, sex);//构造器直接调用构造器
        this.age = age1;
    }

    void talk() {
        System.out.println("student talk");

    }

    @Override
    void walk() {

        System.out.println("student walk");

    }
}
