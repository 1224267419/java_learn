package com.circle.cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Cylinder cy=new Cylinder(2);
        cy.setRadius(3);
        System.out.println("半径是"+cy.getRadius());
        System.out.println("高是"+cy.getLength());
        cy.setLength(10);
        System.out.println("高是"+cy.getLength());

        System.out.println("面积是 "+cy.findArea());
        System.out.println("体积是 "+cy.findVolunme());
    }
}
