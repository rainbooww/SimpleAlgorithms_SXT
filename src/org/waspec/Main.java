package org.waspec;

public class Main {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        for (int row = 0; row < 8; row++) {//行
            for (int cell = 0; cell < 8; cell++) {
                if ((row+cell)%2==0)
                    System.out.print("x");
                else System.out.print("o");
            }
            System.out.println();
        }
    }
}




