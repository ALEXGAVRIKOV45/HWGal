/**
 *  Java 1. Homework #3
 *
 *  @ author Alex Gavrikov
 *  @ version 15/12/2021
 *
 */
import java.util.Random;
import java.util.Arrays;

class HWGal3 {
    public static void main(String[]args) {
        int[]arr = {2,2,2,1,2,2,10,1};

        initArrayAndInvers();
        System.out.println();
        initArrayOneHudred();
        System.out.println();
        initArrayMultTwo();

        System.out.println();
        printDialonals();
        System.out.println();
        
        System.out.println(Arrays.toString(returnArray(10, 77)));
        System.out.println();
        searchMaxMin();
        System.out.println();
        System.out.println(checkBalance(arr));

    }

    static void initArrayAndInvers() {
        Random random = new Random();
        int[]arr = new int[50];
        for (int i = 0; i < 50; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 50; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void initArrayOneHudred() {
        int[]arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void initArrayMultTwo() {
        int[]arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void printDialonals() {
        int[][]table = new int[10][10];
        int counter = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = counter;
                System.out.print((table[i][j] < 10) ? "  " + table[i][j] + " " : table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            table[i][i] = 1;
            table[i][9 - i] = 1;
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((table[i][j] < 10) ? "  " + table[i][j] + " " : table[i][j] + " ");

            }
            System.out.println();
        }
    }
    static int[]returnArray(int len, int initialValue) {
        int[]arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    static int[]searchMaxMin() {
        Random random = new Random();
        int[]arr = new int[50];
        int iMax = 0;
        int iMin = 0;
        int vMax = -2147483648;
        int vMin = 2147483647;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] > vMax) {
                vMax = arr[i];
                iMax = i;
            }
            if (arr[i] < vMin) {
                vMin = arr[i];
                iMin = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max is " + vMax + " arr[" + iMax + "]");
        System.out.println("Min is " + vMin + " arr[" + iMin + "]");
        return arr;
    }

    static boolean checkBalance(int[]arr) {
        int sumLeft = 0;
        int sumFull = 0;
        for (int i = 0; i < arr.length; i++) {
            sumFull = sumFull + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sumLeft = sumLeft + arr[i];
            if (sumLeft == sumFull - sumLeft) {
				System.out.println(Arrays.toString(arr));
                return true;
            }
        }
        return false;
    }

}
