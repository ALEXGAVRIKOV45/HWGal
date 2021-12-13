/**
 *  Java 1. Homework #2
 *
 *  @ author Alex Gavrikov
 *  @ version 13/12/2021
 *
 */

class HWGal2 {
    public static void main(String[]args) {
        int Y;
        System.out.println(summTwoNumbers(5, 5));
        System.out.println(summTwoNumbers(5, 4));
        printNumberSign(0);
        printNumberSign(10);
        printNumberSign(-55);
        System.out.println(checkNumberSign(10));
        System.out.println(checkNumberSign(-15));
        printString("Super String", 7);

        Y = 2021;
        System.out.println(" Year " + Y + "-" + (checkYearkLeap(Y) ? " Leap" : "Not leap"));

        /* test code years 1 - 3000
        for (Y = 1; Y < 3000; Y++) {
        System.out.println(" Year " + Y + "-" + (checkYearkLeap(Y) ? " Leap" : "Not leap"));
        }
         */
    }

    static boolean summTwoNumbers(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    static void printNumberSign(int a) {

        System.out.println(a >= 0 ? "Number " + a + " is positive" : "Number " + a + " is negative");

    }

    static boolean checkNumberSign(int a) {
        return (a <= 0);
    }

    static void printString(String StrP, int a) {

        for (int i = 0; i < a; i++) {
            System.out.println(StrP);
        }
    }

    static boolean checkYearkLeap(int year) {

        if ((year % 4 == 0)) {
            if ((year % 100 == 0)) {
                if ((year % 400 == 0)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
