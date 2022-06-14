package com.atguigu.java;
import com.atguigu.java1.*;//包内所有元素用*
import java.util.*;//工具包

public class PackageImportTest   {
    public static void main(String[] args) {
        com.atguigu.java1.OrderTest o=new com.atguigu.java1.OrderTest();//非同包调用,且没有import类必须写上包的全名
    }
}
