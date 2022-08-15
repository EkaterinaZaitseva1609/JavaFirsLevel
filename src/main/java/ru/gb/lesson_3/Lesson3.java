package ru.gb.lesson_3;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Lesson3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //считать из консоли

        //  String wholeLine = scanner.nextLine(); // для строк
        // System.out.println("you typed: " + wholeLine);

        //  System.out.println("Введите число");
        //  int intValue = scanner.nextInt(); // для целых чисел
        // double intValue = scanner.nextDouble(); // для чисел с плавающей точкой
        //System.out.println("Вы ввели: " + intValue);
/*

        System.out.println("На каком курсе вы учитесь?");
         int valueRange = getValueInRange (1, 9);
        System.out.println("Вы учитесь на " + valueRange + " курсе");
        System.out.println("сколько вам лет? ");
        int age = getValueInRange(0, 150);
        System.out.println("Вам " + age + " лет");

        scanner.close();

 */
        //int[] arr = {3, 5, 6, 7, 2, 5};
        //printArray(arr);

        // int[][] matrix = new int [3][3];
        //printDoubleArray(matrix);

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        print2DArray(arr);

       // int[] arr = {4, 6, 3, 5, 8, 9};
        //int res = sum(arr);
        //System.out.println("Сумма массива = " + res);

        int sum2d = sum2d(arr);
        System.out.println("СУММА ДВУМЕРНОГО МАССИВА = " + sum2d);
    }

    // Метод, который запрашивает от пользователя число в указанном диапазоне
    public static int getValueInRange(int min, int max) {
        int result;
        do {
            System.out.println("Введите число в диапазоне от " + min + " до " + max);
            result = scanner.nextInt();
        } while (result < min || result > max);

        return result;
    }

    // Вывод массива в консоль через пробел
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Вывод двумерного массива в консоль через пробел
    public static void printDoubleArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // другой вариант вывода двумерного массива
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] subArray = array[i];
            printArray(subArray);

        }
    }

    // Сумма всех элементов массива

    public static int sum(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }

    // Сумма элементов двумерного массива

    public static int sum2d(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
           sum += sum(array[i]);

        }
        return sum;
    }

    //

}