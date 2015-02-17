package org.waspec;

public class Main{
    public static void main(String[]args){
        System.out.println(addMethod1(100));
        System.out.println(addMethod2(100));
        System.out.println(addMethod3(100));

    }

    public static int addMethod1(int n){
        int result= (1+n)*n/2;
        return result;
    }

    public static int addMethod2(int n){
        int result=0;
        for (int i = 1; i <=n; i++) {
            result+=i;
        }
        return result;
    }
    public static int addMethod3(int n){
        int result=0;
        if (n==1){
            result=1;
        }else{
            result=n + addMethod3(n-1);
        }

        return result;
    }
}



/*public class Main {
    public static void main(String[] args) {
        int x = 100;
        switch (x) {
            default:
                System.out.println("error");

            case 99:
                System.out.println("a");

            case 1:
                System.out.println("d");

            case 60:
                System.out.println("c");
                break;

        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        LinkList nod = new LinkList(10);
        nod.nex = new LinkList(21);
        nod.nex.nex = new LinkList(30);
        nod.nex.nex.nex = new LinkList(40);

        LinkList current = nod;
        do {
            System.out.println(current.value);
            current= current.nex;
        } while (current !=null);
    }
}

class LinkList{
    public LinkList(int value) {
        this.value = value;
    }

    public int value;
    public LinkList nex;
}*/


/*public class Main {
    public static int level;

    public static void main(String[] args) {
        int result = hanoii(10);
        System.out.println(result);

    }

    public static int hanoii(int level) {
        int result = 0;
        if (level == 1) {
            result = 1;
        } else {
            result = 1 + hanoii(level - 1) + hanoii(level - 1);
        }
        return result;
    }
}*/

    /*public static void main(String[] args) {
        Cake cake = new Cake();
        Box<Cake> box = new Box<Cake>();
        box.payload = cake;

        Apple apple= new Apple();
        Box<Apple> box2= new Box<Apple>();
        box2.payload= apple;
    }
}
class Apple{

}

class Cake{

}

class Box <P>{
    public P payload;
}*/


       /* int[] a={1,1,1,3,3,3,5,5,5,5,5};
        System.out.println(findMaxLength(a));
    }

    public static int findMaxLength(int[]a) {
        int startIndex = 0;
        int endIndex = 0;
        int currentLen = 0;
        int maxLen = 0;
        *//*if (a.length==1){
            return 1;
        }
        if (a.length==0){
            return 0;
        }
*//*
        while (endIndex < a.length) {
            if (a[startIndex] == a[endIndex]) {
                currentLen = endIndex - startIndex;
                maxLen = currentLen;
            } else {
                startIndex = endIndex;
            }
            endIndex++;
        }
    return maxLen+1;
    }
*/

