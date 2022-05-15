package lesson4;
import java.util.Scanner;
import java.util.Random;

public class CrossesAndZerosApp {
    public static void main(String[] args) {
        String[][] map = initField(3);
        boolean isGameActive = true;
        System.out.println("Поехали!");
        printMap(map);

        while (isGameActive) {

            playerTurn(map);
            printMap(map);
            if (isWinner("X", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }

            computerTurn(map);
            printMap(map);
            if (isWinner("0", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }
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
        System.out.println("Смертная тварь ходи!");

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

    public static boolean isWinner(String mark, String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if ( map[i][0].equals(mark) && map[i][1].equals(mark) && map[i][2].equals(mark) ) {
                    System.out.println(mark + " победа!");
                    return true;
                }
                if ( map[0][j].equals(mark) && map[1][j].equals(mark) && map[2][j].equals(mark) ) {
                    System.out.println(mark + " победа!");
                    return true;
                }
                if ( map[0][0].equals(mark) && map[1][1].equals(mark) && map[2][2].equals(mark)
                     || map[0][2].equals(mark) && map[1][1].equals(mark) && map[2][0].equals(mark) )
                 {
                    System.out.println(mark + " победа!");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDraw(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j].equals("*")) {
                    return false;
                }
            }
            System.out.println("Силы равны!");

        }
        return true;
    }

}

