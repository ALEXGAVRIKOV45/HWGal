/**
 *  Java 1. Homework #5
 *
 *  @ author Alex Gavrikov
 *  @ version 22/12/2021
 *
 */

class HWGal5 {
    public static void main(String[]args) {
        Person[]persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Driver", "driv77@mail.ru", 891957904, 50_000, 45);
        persArray[1] = new Person("Sidorov Sidor", "Manager", "manager88@mail.ru", 891944556, 100_000, 58);
        persArray[2] = new Person("Petov Petr", "Cook", "cook@mail.ru", 895645627, 40_000, 24);
        persArray[3] = new Person("Gavrilov Gavrila", "Sailor", "seamen12@mail.ru", 896577123, 50_000, 38);
        persArray[4] = new Person("Nikolaev Nikolay", "Bocman", "bocman1983@mail.ru", 89196604, 70_000, 47);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }

}

class Person {
    private String name;
    private String position;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    Person(String name, String position, String email, int telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + ", " + position + ", " + email + ", " + telephone + ", " + salary + ", " + age;
    }

}
