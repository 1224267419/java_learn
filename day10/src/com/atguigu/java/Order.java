package com.atguigu.java;

public class Order {
    private  int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){//最小的权限也可以在类内被使用
        orderDefault=1;
        orderPrivate=2;
        orderPublic=3;

    }
}
