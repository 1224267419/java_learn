package com.java11;
import com.java1.Order;

public class OrderTest1 {//不同包非子类
    public static void main(String[] args) {
        Order order =new Order();
        order.orderPublic=1;
        //order.orderProtected=1;
        //order.orderDefault=1;//非同包只有public和protect能访问
        //order.orderPrivate=1;//


        //order.methodPrivate();//用不了
        //order.methodDefault();
        //order.methodProtected();不同包用不了Private,缺省和Protected的方法
        order.methodPublic();
    }
}
