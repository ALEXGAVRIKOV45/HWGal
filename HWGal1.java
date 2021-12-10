public class HWGal1 {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        String PrintWord;

        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                PrintWord = "Orange";
            } else if (i == 2) {
                PrintWord = "Banana";
            } else {
                PrintWord = "Apple";
            }
            System.out.println(PrintWord);
        }

    }
    static void checkSumSign() {
        int a;
        int b;
        a = -8;
        b = 8;
        if (a + b >= 0) {
            System.out.println("Summ positive");
        } else {
            System.out.println("Summ negative");
        }
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
