package com.finalduixiang.java1;

public class AbstractTest {
    public static void main(String[] args) {
        //Person p1=new Person();//抽象类不能被实例化

    }
}
abstract class Person{
    String name;
    int age;

    //抽象类中仍可以有构造器,且必须要有默认构造器让子类继承
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("我喜欢吃");
    }
    abstract public void walk();
    //抽象方法只有声明没有方法体,且类必须是抽象类(因为不能被调用  )

}

class Student extends Person{
    int id;


    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public void eat(){
        System.out.println("学生吃得好");
    }

    public void walk(){//抽象方法必须被重写
        System.out.println("学生走得快");
    }
}