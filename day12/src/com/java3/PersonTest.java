package com.java3;

public class PersonTest {
    public static void main(String[] args) {
        Person p0=new Person();
        Man man=new Man(1);
        Person p1=new Man(1);//new子类也可以得到person,体现了多态
        p0.say();
        man.say();
        p1.say();//调用的是Man的方法
    }

}
