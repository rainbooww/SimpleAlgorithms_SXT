package org.waspec;

public class Main {
    public static void main(String[] args) {
        Weapon myWeapon1 = new RocketLauncher();
        Weapon myWeapon2 = new Tank();
        myWeapon1.fire();
        myWeapon2.fire();
    }
}

interface Vehicle {//base interface 基接口，有些为形容词，众多为名词
    public abstract void run(); // 接口里的方法只有声明，没有定义 没有方法体，不管具体功能的实现, public abstract可不写
}

interface Weapon{
    public abstract void fire();
}

class  Truck implements Vehicle {
    @Override
    public void run(){
        System.out.println("I am running on the highway");
    }
}

class Tank implements Vehicle, Weapon {
    @Override
    public void run() {
        System.out.println("I am running on battlefield.");
    }

    @Override
    public void fire() {
        System.out.println("Bang!");
    }
}

    class RocketLauncher implements Weapon{
        @Override
        public void fire() {
            System.out.println("3,2,1, launch");
        }
    }



/*public class Main {
    public static void main(String[] args) {
        Truck myTruck = new Truck();
        myTruck.run();

        Tank myTank = new Tank();
        myTank.run();
    }
}

class Truck {
    public void run(){
        System.out.println("I am running on the highway");
    }
}

class Tank {
    public void run(){
        System.out.println("I am running on battlefield.");
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Student student= new Student(1,"Tim");
        student.name="Tim";
        System.out.printf("Student %s's id is %d.\n", student.name, student.id);
    }
}

class Student{
    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {//overload of the above method, 省去一行初始化
        this.id = id;
        this.name = name;
    }

    public int id;
    String name;
}*/


/*
public class Main {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int x= calculator.minus(5,3);
        System.out.println(x);
    }
}

class Calculator{

    public int minus (int a, int b){
        int result = a-b;
        return result;
    }

    public double minus(double x, double y){
        double result= x-y;
        return result;
    }

    public int minus(int a, int b, int c){
        int result= a-b-c;
        return result;
    }
}
*/


/*
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = calculator.add();
        System.out.println(x);
    }
}

    class Calculator {
        public int add(int a, int b) {
            int result = a + b;
            return result;
        }

        public int add(int x, int y, int z ) {
            int result = x + y + z;
            return result;
        }

        public double add(double a, double b){
            double result = a+b;
            return result;
        }
    }
*/





/*
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
*/



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

