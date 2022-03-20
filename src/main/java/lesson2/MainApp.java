package lesson2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(within10and20(2, 2));
        isPositiveOrNegative(12);
        System.out.println(isNegative(-1));
        isStringAndNumber( "I am Batman!",6);
    }
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void isStringAndNumber(String helloBoy, int a) {
        for (int n = 0; n < a; n++) {
            System.out.println("-" + helloBoy);
        }
    }
}
