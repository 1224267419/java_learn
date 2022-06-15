package com.people.kid.test;

public class KidTest {
    public static void main(String[] args) {
        Kids somKid = new Kids(12);
        somKid.setSalary(1000);
        somKid.setSex(1);

        somKid.printAge();
        somKid.employeed();
        somKid.ManWoman();
    }
}
