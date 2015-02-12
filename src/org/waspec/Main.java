package org.waspec;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 10;
        }
        for (int finger: myArray){
            System.out.println(finger);
        }
        }

    }




