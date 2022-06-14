package com.atguigu.java1;

import com.atguigu.java.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderPublic = 1;
        //order.orderDefault=2;//不同包，也调不出来
//        order.orderPrivate=3;//调不出来
        Person p = new Person("Tom");
        System.out.println(p.name);
        Person p1 = new Person();
    }
}
    class Person{
        String name;
        int age;

        public Person(){
            System.out.println("1");//构造器，看成创建对象时默认使用的方法

        }
        public Person(String name){
            System.out.println("123");//构造器，看成创建对象时默认使用的方法
            this.name=name;
            say();
            this.say();
        }//构造器也可以被重载

        public Person(int a,int b){
                this();//做空参的操作
                        //再做其他操作
        }

        public Person(String name,String name2){
            this(name);//调用了public Person(String name){     这个构造器
                        //再写其他的
        }



        public void say(){

            System.out.println("hello");
            return;
        }


    }
