package org.waspec;

public class Main {
    public static void main(String[] args) {
        (new Television()).play();
        double x= 1.1;
        double y= 2.2;
        double result = 0;
        result = Calculator.absAdd(2.2,3.3);//
    }
}

class Television{
    public void play(){
        System.out.println("CCTV channel 10.");
    }
}

class Calculator{
    public static double absAdd(double a, double b){
        double result = a+b;
        System.out.println(result);
        if (result>=0){
            return result;
        }else{
            return -result;
        } //可以有多个return

    }
}
