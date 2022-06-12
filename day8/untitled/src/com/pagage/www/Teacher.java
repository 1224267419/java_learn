package com.pagage.www;

public class Teacher {
    public static void main(String[] args) {
    Student p1=new Student();//必须新建对象才能用属性和方法
    p1.age=10;
    p1.sex=1;
    System.out.println(p1.age);
    p1.add_age();
    System.out.println(p1.age);
    p1.add_age(2);
        System.out.println(p1.age);
        p1.add_age10();
        System.out.println(p1.age);

        Student [] stu=new Student[20];//类也可以创建数组来得到批量的类
        for (int i=0;i<stu.length;i++){
            stu[i]=new Student();//给数组中的每个元素创建对象
            //创建信息也可以在循环内创建,根据实际情况来就行
        }

    }
}