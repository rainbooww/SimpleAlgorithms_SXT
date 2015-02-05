package org.waspec;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (x<=100) {
            x++;
            System.out.println(x);
            if (x>99) {
                break;
            }
        }
    }
}
