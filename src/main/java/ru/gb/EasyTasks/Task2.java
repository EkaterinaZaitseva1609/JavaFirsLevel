package ru.gb.EasyTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите значение: ");
//        int input_number1 = scanner.nextInt();
//        System.out.print("Введите значение: ");
//        int input_number2 = scanner.nextInt();
//        System.out.print("Введите значение: ");
//        int input_number3 = scanner.nextInt();
//        System.out.println(getMax(input_number1, input_number2, input_number3));


//        System.out.print("Введите значение: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите значение: ");
//        int b = scanner.nextInt();
//        System.out.print("Введите значение: ");
//        int c = scanner.nextInt();
//        getRes(a, b, c);

        int n = 5;
        int[] arr = {-5, 1, 2, 3, 4, 5, 6, 7, 8, -3};
        grtResult(n, arr);

    }

    private static void grtResult(int n, int[] arr) {
        int[] arrRes = new int[2];
        int res1 = 0;
        int res2 = 1;
        int max = arr[0];
        int min = arr[0];
        int indmax = 0;
        int indmin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res1 = res1 + arr[i];

            }
            if (max < arr[i]) {
                max = arr[i];
                indmax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                indmin = i;
            }
        }
        if (indmin > indmax) {
            int temp = indmax;
            indmax = indmin;
            indmin = temp;
        }
            for (int i = indmin + 1; i < indmax; i++) {
                res2 = res2 * arr[i];
            }

        arrRes[0] = res1;
        arrRes[1] = res2;
        System.out.println(Arrays.toString(arrRes));

    }


    private static void getRes(int a, int b, int c) {
        if (a * b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static int getMax(int input_number1, int input_number2, int input_number3) {
        int res = (Math.max(input_number1, input_number2));
        return (Math.max(res, input_number3));
    }
}
