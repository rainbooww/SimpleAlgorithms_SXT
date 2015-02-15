package org.waspec;

public class Main {
    public static void main(String[] args) {
        int[] a={1,1,1,3,3,3,5,5,5,5,5};
        System.out.println(findMaxLength(a));
    }

    public static int findMaxLength(int[]a) {
        int startIndex = 0;
        int endIndex = 0;
        int currentLen = 0;
        int maxLen = 0;
        /*if (a.length==1){
            return 1;
        }
        if (a.length==0){
            return 0;
        }
*/
        while (endIndex < a.length) {
            if (a[startIndex] == a[endIndex]) {
                currentLen = endIndex - startIndex;
                maxLen = currentLen;
            } else {
                startIndex = endIndex;
            }
            endIndex++;
        }
    return maxLen+1;
    }
}

