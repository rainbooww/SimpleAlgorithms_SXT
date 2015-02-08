package org.waspec;
public class Main {
    public static void main(String[] args) {
        Calculator circle= new Calculator();
        System.out.println(circle.getCircleArea());
    }
}

    class Calculator {
         double getCircleArea() {
             double r=10;
             double area;
             return area= Math.PI * r * r;
         }
    }







