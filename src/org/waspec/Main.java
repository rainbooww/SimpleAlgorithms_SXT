package org.waspec;

public class Main {
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3};
        System.out.println(findMaxLength(a));
    }

    public static int findMaxLength(int[]a){
        int startIndex=0;
        int maxLen=0;
        int i=0;
        int currentLen=0;
        for ( i = 1; i < a.length; i++) {
            if (a[i]!=a[i-1]){
                 currentLen= i-startIndex;
                startIndex=i;
                if (currentLen>maxLen){
                    maxLen=currentLen;
                }
            }
        }
           currentLen= i-startIndex;
           if(currentLen>maxLen){
               maxLen=currentLen;
       }
        return maxLen;
    }
}

