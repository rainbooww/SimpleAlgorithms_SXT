package org.waspec;
public class Main {
    public static void main(String[] args) {
        double r =10;
        double area = Calculator.getCircleArea(10);
        System.out.println(area);

    }
}

    class Calculator {
        double r;
        static double getCircleArea(double r) {
            double area;
            return area = Math.PI * r * r;
        }
    }







