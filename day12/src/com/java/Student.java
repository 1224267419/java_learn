package com.java;

public class Student extends Person{
    String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }
    public void learn(){
        System.out.println("学习"+major+"科目");
    }
    public void eat(){
        System.out.println("学生吃得好");
    }

    private void walk() {
        System.out.println("private学生");
    }
    /*
    public int tall(){
        return 1;
    }
    */
    //直接报错

}
