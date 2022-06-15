package com.people.kid.test;

public class People {
    private int sex;//性别
    private  int salary;//薪资

    public People() {
    }

    public People(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public int getSalary() {
        return salary;
    }

    public void ManWoman() {
        if(sex==1){
            System.out.println("男人");
        }
        else{
            System.out.println("女人");
        }
    }
    public void employeed() {
        if(salary==0){
            System.out.println("没工作");
        }
        else{
            System.out.println("有工作");
        }
    }
}
