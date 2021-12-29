/**
 *  Java 1. Homework #7
 *
 *  @ author Alex Gavrikov
 *  @ version 29/12/2021
 *
 */
//import java.util.Random;

class HWGal7 {
    public static void main(String[]args) {

        Cat cat1 = new Cat("Pushok", 4, false);
        Cat cat2 = new Cat("Murzik", 3, false);
        Cat cat3 = new Cat("Barsik", 5, false);
        Cat cat4 = new Cat("Murka", 3, false);
        Cat cat5 = new Cat("Kotya", 5, false);
        Cat[]cats = {
            cat1,
            cat2,
            cat3,
            cat4,
            cat5
        };

        Plate plate = new Plate(11);
        while (plate.getFood() > 0) {
            System.out.println(plate);
            for (int i = 0; i < cats.length; i++) {
                cats[i].eat(plate);
                System.out.println(cats[i]);

            }
            if (plate.getFood() > 0) {
                plate.addFood(9);
            }

        }
    }

}

class Cat {
    private String name;
    private int appetite;
    private Boolean satiety;

    Cat(String name, int appetite, Boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    void eat(Plate plate) {
        if (!this.satiety) {
            this.satiety = plate.decreaseFood(appetite);
        }
    }

    String getName() {
        return this.name;
    }

    int getAppetite() {
        return this.appetite;
    }

  

     @ Override
    public String toString() {
        return "Cat " + name + ", appetite: " + appetite + " satiety - " + satiety;

    }

}

class Plate {
    private int food;

     @ Override
    public String toString() {
        return "Food: " + food;
    }

    int getFood() {
        return this.food;
    }

    Boolean decreaseFood(int appetite) {
        if (this.food >= appetite) {
            this.food -= appetite;
            return true;
        }
        return false;

    }

    void addFood(int food) {
        this.food += food;

    }
    Plate(int food) {
        this.food = food;

    }

}
