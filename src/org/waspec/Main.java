package org.waspec;

public class Main {
    public static void main(String[] args) {
        char[] chars = "this is cat".toCharArray();
        reversePart(chars, 0, chars.length - 1);
        String string = new String(chars);
        System.out.println(chars);
    };

        public static void reversePart(char[] charArray, int startIndex, int endIndex){
            int leftIndex = startIndex;
            int rightIndex = endIndex;
            while (leftIndex<= rightIndex){
            char temp= charArray[leftIndex];
            charArray[leftIndex] = charArray[rightIndex];
            charArray[rightIndex]=temp;
            leftIndex++;
            rightIndex--;
            }
    }
}


class Student{
public int score;

}




