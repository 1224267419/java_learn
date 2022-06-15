package com.java11;
import com.java1.Order;

public class OrderTest2 extends Order{//不同包子类
    public  void method() {
        //Order order1 =new Order();
        orderProtected=1;
        orderPublic=1;
        //order.orderDefault=1;//非同包只有public和protect能访问
        //order.orderPrivate=1;//


        //order.methodPrivate();//用不了
        //order.methodDefault();
        //order.methodProtected();不同包用不了Private,缺省和Protected的方法
        methodPublic();
        methodProtected();

    }
}
