package com.java3;

public class Man extends Person{
    int sex=1;

    public Man() {
    }

    public Man(int sex) {
        this.sex = sex;
    }

    public void say(){

        System.out.println("Man");
    }

}
