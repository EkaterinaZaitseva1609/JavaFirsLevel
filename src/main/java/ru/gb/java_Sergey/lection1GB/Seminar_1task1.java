package ru.gb.java_Sergey.lection1GB;

import java.util.Scanner;

public class Seminar_1task1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


//        System.out.println("Укажите число a");
//        int a = scanner.nextInt();
//        System.out.println("Укажите число b");
//        int b = scanner.nextInt();
//        getRes(a, b);

        System.out.println("Укажите число n");
        int n = scanner.nextInt();
        getTriengle(n);


    }

    private static void getTriengle(int n) {
        int x = 0;
        while (x <= n) {
            x = (n * (n + 1) / 2);
        }
        System.out.println(x);
    }

    //   Задача №2
    private static void getRes(int a, int b) {
        int c = 2;
        int d = 1;
        int k1 = a;
        if (a > b) {
            System.out.println("нет решения");
        } else {
            while (k1 != b) {
                if (k1 * c <= b) {
                    k1 = k1 * c;
                    System.out.println("k1");
                } else if (k1 + d <= b) {
                    k1 = k1 + d;
                    System.out.println("k2");
                }
            }
        }
    }
}

