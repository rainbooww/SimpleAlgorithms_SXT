package org.waspec;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {9, 9, 7, 7, 7, 5, 5, 5, 5, 5, 4, 3, 8, 8, 8, 8, 8, 8, 8, 8, 7, 7, 2, 2};
        int count = 1;
        int tempCount;
        int most = myArray[0];
        int temp = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            temp = myArray[i];
            tempCount = 0;
            for (int j = 1; j < myArray.length; j++) {
                if (temp == myArray[j])
                    tempCount++;
            }
            if (tempCount > count) {
                most = temp;
                count = tempCount;
            }
        }
        System.out.println(most);
    }
}
