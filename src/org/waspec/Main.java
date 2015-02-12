package org.waspec;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {9, 9, 7, 7, 7, 5, 5, 5, 5, 5, 4, 3, 8, 8, 8, 8, 8, 8, 8, 8, 7, 7, 2, 2};
        int result = longestSubArrayLengh(myArray);
        System.out.println((result));
    }
    public static int longestSubArrayLengh(int[] input){

        if (input==null||input.length==0){
            return 0;
        }
        int startIndex=0;
        int endIndex=0;
        int delta=0;// 变化亮
        while(endIndex<input.length){
            int temp=0;
            if(input[endIndex]==input[startIndex]){
                temp= endIndex-startIndex;
                if(temp>delta){
                    delta=temp;
                }
            }else{
                startIndex= endIndex;
            }
            endIndex++;
        }
        return delta+1;
        }
    }

