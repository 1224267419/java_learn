package com.circle.cylinder;

public class Cylinder extends Circle{
    double length;

    public Cylinder(double radius) {
        super(radius);
        this.length = 1.0;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }


    public double findVolunme() {
        return findArea()*length;
    }
}
