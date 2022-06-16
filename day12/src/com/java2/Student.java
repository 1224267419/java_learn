package com.java2;

public class Student extends Person{

    int age=1;

    public Student() {

    }

    public Student(int age, int sex,String name) {
        super.setSex(sex);//构造函数也可以用super方法来调用
        super.name=name;//直接用属性也行
        this.age = age;
    }

    public Student(int age, String name, int sex, int age1) {
        super(age, name, sex);//构造器直接调用构造器
        this.age = age1;
    }

    void talk() {
        System.out.println("student talk"+'\t'+this.age+'\t'+super.age);
        this.walk();
        super.walk();
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("student walk");
    }
}
