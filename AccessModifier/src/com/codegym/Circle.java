package com.codegym;

public class Circle {
     private double radius;
     private String color;
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public  double getRadius(){
        return this.radius;
    }
    public  double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public static void main(String[] args) {

    }
}
