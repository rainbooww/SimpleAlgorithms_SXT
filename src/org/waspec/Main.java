package org.waspec;

public class Main {
    public static void main (String[] args){
       String [][] s;
        s= new String[3][];
        s[0]= new String[2];
        s[1]= new String[3];
        s[2]= new String[2];
        for (int i = 0; i <s.length; i++) {
            for (int j = 0; j <s[i].length ; j++) {
                s[i][j]= new String(" my position is: "+i+","+j);
            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }

}






