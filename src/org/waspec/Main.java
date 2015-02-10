package org.waspec;

public class Main {
    public static void main(String[] args) {
        String[] a={"this","is","a","black","cat"};
        for (int i = 0; i < a.length/2; i++) {
           String temp= a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]= temp;
            }
        for(int i=0; i<a.length;i++)
            System.out.print(a[i]+"");
            }
        }



