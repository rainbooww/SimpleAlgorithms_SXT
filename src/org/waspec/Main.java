package org.waspec;

public class Main {
    public static void main(String[] args) {
        int score = 100;
        int x = (score-1)/20;
            switch (x) {//必须整数类型表达式

                case 0:
                case 1:
                    System.out.println("d");
                    break;
                case 2:
                    System.out.println("c");
                    break;
                case 3:
                    System.out.println("b");
                    break;
                case 4:
                    System.out.println("a");
                    break;
                default:
                    System.out.println("error");
                    break;

            }

        }
    }


