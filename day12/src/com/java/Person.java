package com.java;

public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void eat() {
        System.out.println("人吃饭");
    }
    public void walk(int distance) {
        System.out.println("走了"+distance+"米");
    }
    private void walk() {
        System.out.println("private");
    }
    public float tall(){
        return 1.0f;
    }

}
