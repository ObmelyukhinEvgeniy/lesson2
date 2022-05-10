package lesson3;

public class MainApp {
    public static void main(String[] args) {
        numbers();
        sotochka();
        xTwo();
        dioganal();
        enterLen(4,5);
    }

    public static void numbers() {

        int[] arr = {1, 0, 1, 0, 0, 1, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        }

    }

    public static void sotochka() {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.println("sotochka [" + i + "] = " + arr[i]);
            }
        System.out.println();
    }

    public static void xTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.print(arr[i] * 2 + ", ");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void dioganal() {
        int[][] arr = new int [6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( i == j) {
                    System.out.print( 1 );
                }
                else if ( i + j == 5 ) {
                    System.out.print( 1 );
                }
                else {
                    System.out.print( 0 );
                }
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    public static void enterLen( int len, int initialValue ) {
        int[] arr = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println("enterLen [" + i + "] = " + arr[i]);
        }
    }
}
