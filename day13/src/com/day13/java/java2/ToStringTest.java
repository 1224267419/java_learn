package com.day13.java.java2;

import com.day13.java.java1.Person;

public class ToStringTest {
    public static void main(String[] args) {
        Person p1 =new Person();
        System.out.println(p1.toString());
        System.out.println(p1);//改写了com.day13.java.java1.Person的.toString()方法,自己注释掉试试就知道了

    }
}
