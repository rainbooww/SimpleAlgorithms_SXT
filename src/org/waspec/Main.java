package org.waspec;

public class Main {
    public static void main(String[] args) {
        int [] myArray= {1,3,2,4,7,8,0,6};
        for (int i = 0; i <(myArray.length)/2 ; i++) {
            int temp= myArray[i];
            myArray[i]= myArray[myArray.length-1-i];
            myArray[myArray.length-1-i]=temp;
        }
        System.out.println(myArray);
        }

        }


