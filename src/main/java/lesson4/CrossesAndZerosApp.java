package lesson4;
import java.util.Scanner;
import java.util.Random;

public class CrossesAndZerosApp {
    public static void main(String[] args) {
        String[][] map = initField(3);
        System.out.println("Поехали!");

        while (true) {
            printMap(map);
            playerTurn(map);

            computerTurn(map);
            printMap(map);
        }
    }

    public static String[][] initField(int size) {
        String[][] map = new String[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "*";
            }
        }
        return map;
    }

    public static void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void playerTurn(String[][] map) {
        System.out.println("Смертная тварь ходит!");

        Scanner sc = new Scanner(System.in);

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                if (map[x - 1][y - 1].equals("*")) {
                    map[x-1][y-1] = "X";
                    isActiveTurn = false;
                } else {
                    System.out.println("Занято!");
                  }
            } else {
                System.out.println("Что, краёв не видишь?!");
              }
        }
    }

    public static void computerTurn(String[][] map) {
        System.out.println("Железяка ходит!");

        Random random = new Random();

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            int x = random.nextInt(map[0].length);
            int y = random.nextInt(map.length);

                if (map[x][y].equals("*")) {
                    map[x][y] = "0";
                    isActiveTurn = false;
                }
        }
        System.out.println("Железяка сходила!");
    }

    public static boolean isWinner() {
        return false;
    }

}
