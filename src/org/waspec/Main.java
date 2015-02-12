package org.waspec;

public class Main {
    public static void main(String[] args) {
        int x = 100; //switch总要求精确值，用的少
        switch (x) {//必须整数类型表达式
            case 99:                         //case语句
                System.out.println("差一点儿");
                break;
            case 80:
                System.out.println("还差不少");
                break;
            case 60:
                System.out.println("刚及格");
                break;
            case 40:
                System.out.println("call your parent");
                break;
            default:
                System.out.println("???");
        }

    }
}

