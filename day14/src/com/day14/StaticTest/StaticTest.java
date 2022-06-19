package com.day14.StaticTest;

public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation="中国";
        Chinese c1=new Chinese();
        c1.age=40;
        c1.name="小王";

        Chinese c2=new Chinese();
        c1.age=50;
        c1.name="小李";

        Chinese c3=new Chinese();
        c1.age=42;
        c1.name="小黄";

        System.out.println(c1.nation);
        c2.nation="China";
        System.out.println(c2.nation);
        System.out.println(c1.nation);//所有的对象共享一个静态属性(变量),一个更改所有的都更改


    }
}
class Chinese{
    int age;
    String name;
    static  String nation="CNN";
    }
