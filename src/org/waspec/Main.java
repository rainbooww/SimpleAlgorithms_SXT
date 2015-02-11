package org.waspec;

public class Main {
    public static void main (String[] args){
        int a [][]={{1,2},{3,4,5,6},{7,8,9}};
        for (int i = 0; i <a.length ; i++) { //第一维数组里的3个数组循环
            for (int j = 0; j < a[i].length; j++) { //第二维数组里的元素进行循环
                System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "  ");
            }
            System.out.println();//把第一维数组里的每个数组分行
        }
    }
}







