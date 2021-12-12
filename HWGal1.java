/**
 *  Java 1. Homework #1
 *
 *  @ author Alex Gavrikov
 *  @ version 12/12/2021
 *
 */

class HWGal1 {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    static void checkSumSign() {
        int a = -8;
        int b = 8;
		System.out.println(a + b >= 0 ? "Summ positive" : "Summ negative");
		
    }

    static void printColor() {
        int value = 115;
        String PrintWord;
        if (value <= 0) {
            PrintWord = "Red";
        } else if (value > 0 && value <= 100) {
            PrintWord = "Yellow";
        } else {
            PrintWord = "Green";
        }
        System.out.println(PrintWord);

    }
    static void compareNumbers() {
        int a = 10;
        int b = 7;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

}
