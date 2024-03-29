package com.tms.lesson7_hw.task2.run;

import com.tms.lesson7_hw.task2.figure.Circle;
import com.tms.lesson7_hw.task2.figure.Figure;
import com.tms.lesson7_hw.task2.figure.Rectangle;
import com.tms.lesson7_hw.task2.figure.Triangle;

public class Run {
    public static void main(String[] args) {
        Figure[] figure = {new Circle(4), new Rectangle(7,100),
                            new Circle(1.4), new Triangle(10.5,20,15),
                            new Rectangle(7,114)};

        double pSum = 0;
        for (Figure x : figure){
            System.out.println(x.getName() + "; area = " + x.getArea() + "; perimeter = " + x.getPerimeter());
            pSum += x.getPerimeter();
        }
        System.out.println(pSum);

    }
}
