package com.day13.java.java1;

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

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    void talk(){
        System.out.println("Peopke talk");
    }
    void walk(){
        System.out.println("Peopke walk");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return super.equals(obj);
        }
        if (obj instanceof Person) {
            Person p1 = (Person) obj;
            return this.age == p1.age && this.name.equals(p1.name);
        }
        return  false;


    }
}
