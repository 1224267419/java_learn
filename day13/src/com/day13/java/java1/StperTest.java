package com.day13.java.java1;

public class StperTest {
    public static void main(String[] args) {
       Student   s1=new Student();
        s1.talk();
        s1.walk();
        Person p1=new Student();//类似自动类型提升,向上转型
        p1.walk();
        Student s2=(Student) p1;//类似强制类型转换,向下转型
        s2.walk();//方法啥的也可用,也会调用子类的构造器

        //Person p2=new Person();
        //Student s5=(Student) p2;//编译不报错,但是运行不通过,因为高类型不能转低类型
        //s5.walk();
        //然而,强转可能会出现问题,怎么判断转化是否合理呢:
        if(p1 instanceof Student){
            Student s3=(Student) p1;//先判断再转,避免向下转型出现异常
            s3.walk();
        }
        Person p2=new Person();
        p2.walk();
    }
}
