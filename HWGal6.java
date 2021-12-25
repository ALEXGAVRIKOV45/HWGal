/**
 *  Java 1. Homework #6
 *
 *  @ author Alex Gavrikov
 *  @ version 25/12/2021
 *
 */
import java.util.Random;

class HWGal6 {
    public static void main(String[]args) {
        int distrun;
        int distsail;
        Random random = new Random();
        IAnimal cat1 = new Cat("Chernysh", "black", 3, 200);
        IAnimal cat2 = new Cat("Pushok", "white", 5, 200);
        IAnimal cat3 = new Cat("Ryzik", "ginger", 1, 200);
        IAnimal dog1 = new Dog("Palkan", "brown", 6, 500, 10);
        IAnimal dog2 = new Dog("Charlie", "grey", 7, 500, 10);
        IAnimal dog3 = new Dog("Anda", "sand", 3, 500, 10);
        IAnimal[]animals = {
            cat1,
            cat2,
            cat3,
            dog1,
            dog2,
            dog3
        };
        for (IAnimal a: animals) {
            distrun = random.nextInt(600);
            distsail = random.nextInt(15);
            if (distrun == 0)
                distrun++;
            if (distsail == 0)
                distsail++;
            System.out.println(a);
            System.out.println(a.voice());
            System.out.println(a.run(distrun));
            System.out.println(a.sail(distsail));
            System.out.println();
        }

    }

}

class Cat extends Animal {
    Cat(String name, String color, int age, int limitsrun) {
        super(name, color, age, limitsrun);
    }

     @ Override
    public String run(int dist) {
        return dist <= limitsrun ? "Cat " + name + "  runs - " + dist + " m" : "Cat can`t runs - " + dist + " m !";
    }

     @ Override
    public String sail(int dist) {
        return "Cat can`t swim !";
    }

     @ Override
    public String voice() {
        return "meow";
    }

}

class Dog extends Animal {
    Dog(String name, String color, int age, int limitsrun, int limitssail) {
        super(name, color, age, limitsrun, limitssail);
    }

     @ Override
    public String run(int dist) {
        return dist <= limitsrun ? "Dog " + name + "  runs - " + dist + " m" : "Dog can`t runs - " + dist + " m !";
    }

     @ Override
    public String sail(int dist) {
        return dist <= limitssail ? "Dog " + name + "  swim - " + dist + " m" : "Dog can`t swim  - " + dist + " m !";
    }

     @ Override
    public String voice() {
        return "gaf-gaf";
    }

}

interface IAnimal {
    String voice();

    String run(int dist);

    String sail(int dist);

}

abstract class Animal implements IAnimal {
    protected String name;
    protected String color;
    protected int age;
    protected int limitsrun;
    protected int limitssail;

    Animal(String name, String color, int age, int limitsrun, int limitssail) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.limitsrun = limitsrun;
        this.limitssail = limitssail;
    }

    Animal(String name, String color, int age, int limitsrun) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.limitsrun = limitsrun;

    }

     @ Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }

}
