package ru.gb.lesson1;

public class FirstApp {
    public static void main(String[] args) {
        {
            int a = 2, b = 3, c = 0;
            if (a < b) {
                System.out.println("а меньше б");
            }
            if (a == b) {
                System.out.println("а равно б");
            }
            c = a - b;
            System.out.println("c = " + c);
            if (c >= 0) {
                System.out.println("c не отрицательно");
            }
            if (c < 0) {
                System.out.println("c отрицательно");
            }
            c = b - a;
            System.out.println("c = " + c);
            if (c >= 0) {
                System.out.println("c не отрицательно");
            }
            if (c < 0) {
                System.out.println("c отрицательно");
            }
        }
        /*{
            if (9 < 10) {
                System.out.println("5 меньше 10");
            }
        }*/
        /*{ int a;
          int b;
          a = 128;
          System.out.println("a = " + a);
          b = a / 2;
          System.out.println("b = a / 2 = " + b);
        }*/
        /*{ int a = 10;
          int b = 20;
          int c = (a + b - 5) * 2;
          System.out.println("c = " + c);
        }*/
        /*{ float radius = 2.0f, height = 10.0f;
            float volume = 3.14f * radius * radius * height;
            System.out.println("Обьём цилиндра равен " + volume);
        }*/
        }
}