package com.java2;

public class Person {
    int age=2;
    String name;
    private int sex;

    public Person() {
    }

    public Person(int age, String name, int sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSex() {
        return sex;
    }
    void talk(){
        System.out.println("Peopke talk");
    }
    void walk(){
        System.out.println("Peopke walk");
    }
}
