package ru.gb.Java_Erlan.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Practice_7 {
    public static void main(String[] args) {

        // int[] mass = {44, 5, 78, 10, 176, 3};
        //getMaxMin(mass);

        // int num = 247;
        // getEven(num);

        // int[] mass = {44, 5, 78, 43, 10, 176, 7, 3};
        //getEvenNum(mass);

        // int n = -5;
        // getNums(n);

        //  int n = 324;
        // getSecondNum(n);

        //int n = 7;
        //isHoliday(n);


        // givDegree();

        // int number = 452;
        // getResult(number);

        // int[] mass = new int[8];
        // getMass(mass);


        int[] arr = new int[4];
        getArr(arr);

    }

    private static void getArr(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt (900) + 99;
            System.out.println(arr[i]);
        }
        System.out.println("Четные элементы массива");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }


    private static void getMass(int[] mass) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите элементы массива ");
            mass[i] = scanner.nextInt();
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

    }


    private static void getResult(int number) {
        int res = 0;
        int res2 = 0;
        while (number != 0) {
            res = number % 10;
            res2 += res;
            number = number / 10;
        }
        System.out.println(res2);
    }


    // Возведение в степень
    private static void givDegree() {
        int a, b;
        int res = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("укажите число, которое хотите возвести в степень");
        a = scanner.nextInt();
        System.out.println("укажите степень, в которую хотите возвести число");
        b = scanner.nextInt();
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        System.out.println(res);
    }


    // будний день или выходной
    private static void isHoliday(int num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите цифру от 1 до 7, если понедельник это 1, а воскресенье 7");
        num = scanner.nextInt();
        if (num < 0 || num > 7) {
            System.out.println("Вы ошиблись, под номером " + num + " не указан день недели");
        } else if (num > 0 && num < 6) {
            System.out.println("Это будний день");
        } else {
            System.out.println("Наконец-то выходные!");
        }
    }

    //вывести вторую цифру 3 значного числа
    private static void getSecondNum(int n) {
        int res = 0;
        res = (n % 100) / 10;
        System.out.println(res);

    }


    private static void getNums(int n) {
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = 0; i > n; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    //четные числа вывести в новом массиве
    private static void getEvenNum(int[] mass) {
        int[] arr = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                arr[i] = mass[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }


    private static void getEven(int n) {
        if (n % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // найти мин и макс
    private static void getMaxMin(int[] mass) {
        int min = mass[0];
        int max = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.println("min = " + min + ", max = " + max);
    }


}
