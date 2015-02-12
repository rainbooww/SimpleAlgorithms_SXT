package org.waspec;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i]= new Student();
            students[i].score = i * 10;
        }

        for (Student finger: students){//finger=array copy
            System.out.println(finger.score);
        }
    }
}
class Student {
    public int score;
        }





