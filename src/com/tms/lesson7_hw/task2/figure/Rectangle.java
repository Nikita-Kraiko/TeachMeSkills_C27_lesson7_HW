package com.tms.lesson7_hw.task2.figure;

public class Rectangle extends Figure{
    public String name = "Rectangle";
    public double sideA;
    public double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double area = sideA * sideB;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*(sideA + sideB);
        return perimeter;
    }
    public String getName(){
        return name;
    }
}
