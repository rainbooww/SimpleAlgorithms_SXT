package org.waspec;

public class Main {
    public static void main(String[] args) {
        int [] myArray= {1,3,2,4,7,8,0,6};
        int leftIndex=0;
        int rightIndex= myArray.length-1;
        while(leftIndex<=rightIndex){
            int temp= myArray[leftIndex];
            myArray[leftIndex]= myArray[rightIndex];
            myArray[rightIndex]=temp;
            leftIndex++;
            rightIndex--;
        }
        System.out.println(myArray);
        }

        }


