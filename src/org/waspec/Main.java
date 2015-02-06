package org.waspec;

public class Main {
    public static void main(String[] args) {
        Calculator.add(9.9,1.1);
        double r= Calculator.add(3.3,4.4);
        System.out.println(r);
    }
}

class Calculator{
    public static double add(double a,double b){
        double result = a+b;
        System.out.println(result);
        return result;
    }

}
