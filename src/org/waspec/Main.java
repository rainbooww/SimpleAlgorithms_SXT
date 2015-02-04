package org.waspec;

public class Main {

    public static void main(String[] args){
        double x = 140;
        double y = 4;
        double expression;
        expression = x/y;
        System.out.println(expression);
        System.out.println("I am a happy developer");
    }
}

class Vehicle{
    public double speed;
}
 class Truck extends Vehicle{
     public double payload;
 }

class Car extends Vehicle{
    public int passenger;
}

class Tank extends Vehicle{
};