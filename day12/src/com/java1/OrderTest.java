package com.java1;

public class OrderTest {
    public static void main(String[] args) {//同包非子类
        Order order =new Order();
        order.orderDefault=1;
        order.orderProtected=1;
        order.orderPublic=1;
        //order.orderPrivate=1;//访问不了,不是类内

        //order.methodPrivate();//用不了
        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
    }
}
