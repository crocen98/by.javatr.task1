package by.javatr.task1.ex3.triangle;


import static java.lang.Math.*;

public class StraightTriangle {
    private double firstLeg;
    private double secondLeg;

    public StraightTriangle(double firstLeg, double secondLeg){
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public double calculateArea(){
        return 0.5*firstLeg*secondLeg;
    }

    public double calculateHypotenuse(){
        return sqrt(pow(firstLeg,2) + pow(secondLeg,2));
    }
}
