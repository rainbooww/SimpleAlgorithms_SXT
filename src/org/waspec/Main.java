package org.waspec;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        char [][] board = new char[n][n];
        for (int row = 0; row < n; row++) {
            for (int cell = 0; cell < n; cell++) {
                board[row][cell] = (row+cell)%2==0?'x':'0';
            }
        }
        for (int row = 0; row < n; row++) {
            String rowString = new String(board[row]);
            System.out.println(rowString);
        }
    }
}





