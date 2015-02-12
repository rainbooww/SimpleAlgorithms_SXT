package org.waspec;

public class Main {
    public static void main(String[] args) {
        Zombie[] zombies = new Zombie[5];
        for (int i = 0; i < zombies.length; i++) {
            zombies[i]= new Zombie(i*100);
        }
        for (Zombie zombie: zombies) {
            zombie.age += 10;
        }
        for (int i = 0; i < zombies.length; i++) {
            System.out.println(zombies[i].age);
        }
    }
}
    
    
class Zombie{
    Zombie(int age){
        this.age=age;
    }
    public int age;
}
    