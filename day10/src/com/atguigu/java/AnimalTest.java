package com.atguigu.java;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.name="小王";
        a.age=10;
        //a.leg=4;//不可见,不能直接调用属性
        a.setLeg(4);//可以被方法设置不可见属性，更加可控
        System.out.println(a.getLegs());
        a.show();//仍可通过类内方法得到
    }

}


class Animal{
   String name;
   int age;
   private int legs;//私有化，使其不能直接调用，即封装隐藏


    public void setLeg(int leg) {//设值方法

        if (leg >= 0 & leg <= 4) {//方法中添加限制条件，在添加时用if else做限制
            legs = leg;

        }
        else{
            legs=0;
        }
    }

    public int getLegs() {//获取参数的方法
        return legs;
    }

    public void eat(){
       System.out.println("动物进食");
   }
   public  void show(){
       System.out.println("name =  " +name+" , age = "+age+" , legs = "+legs);
   }

        }


