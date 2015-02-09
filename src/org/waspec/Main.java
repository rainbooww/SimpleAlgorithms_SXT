package org.waspec;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@"+"\t");
            }
            System.out.println();
        }
    }
}


