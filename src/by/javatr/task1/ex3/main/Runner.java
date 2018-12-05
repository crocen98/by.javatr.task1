package by.javatr.task1.ex3.main;

import by.javatr.task1.ex3.triangle.StraightTriangle;
import by.javatr.task1.util.reader.SystemInReader;

public class Runner {
    public static void  main(String ... args){
        SystemInReader reader = new SystemInReader();
        System.out.println("Enter first and second leg of triangle: ");
        System.out.println("First: ");
        double firstLeg = reader.readDouble();
        System.out.println("Second: ");
        double secondLeg = reader.readDouble();
        StraightTriangle triangle = new StraightTriangle(firstLeg,secondLeg);
        System.out.println("Area = " +triangle.calculateArea());
        System.out.println("Hypotenuse = " +triangle.calculateHypotenuse());

    }
}
