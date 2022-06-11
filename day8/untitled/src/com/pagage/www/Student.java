package com.pagage.www;

public class Student {
    int age;
    int sex;
    /**
    1是男
    2是女
     */
    public void add_age() {
        age++;
    }
    public void add_age(int i) {//同名函数可以有带参数和不带参数俩版本
        age+=i;
    }

    public void add_age10() {
        add_age(10);//嵌套函数
    }
/* TODO这样是有问题的，main调用的必须是非静态变量
    public static void main(String[] args) {
        area();
    }

    public static void area() {

    }
  */
}
