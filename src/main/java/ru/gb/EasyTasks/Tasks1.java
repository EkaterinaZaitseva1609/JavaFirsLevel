package ru.gb.EasyTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//        System.out.println(getSum(a, b));

//        int a = 2;
//        System.out.println(getRes(a));

//        int n = 75;
//        getDegree(n);
//
//        int num = 7;
//        getNumb(num);


//        int n = 5;
//        int[] arr  = {4, 16, 19, 31, 2};
//        System.out.println(gerMark(n, arr));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение: ");
        String symbol = in.nextLine();
        System.out.println(getMove(symbol));
    }

    private static String getMove(String symbol) {
        String[] str = symbol.split("-");
        String a = str[0];
        String b = str[1];
        char let = a.charAt(0);
        char did = a.charAt(1);
        char let1 = b.charAt(0);
        char did1 = b.charAt(0);
        String res1 = "";
        String res2 = "";

        if (let < 'A' || let > 'H' && did > 8 || did < 1) {
             res1 = "No";
        } else {
             res1 = "Yes";
        }
        if (let1 < 'A' || let1 > 'H' && did1 > 8 || did1 < 1) {
            res2 = "No";
        } else {
            res2 = "Yes";
        }
        if (res1.equals(res2)) {
            return "Yes";
        }else {
            return "No";
        }
    }





    private static boolean gerMark(int n, int[] arr) {
        int[] poz = new int[arr.length];
        int[] neg = new int[arr.length];
        int curr = 0;
        int currNeg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                poz[curr++] = arr[i];
            } else {
                neg[currNeg++] = arr[i];
            }

        }
        System.out.println(Arrays.toString(poz));
        System.out.println(Arrays.toString(neg));
        return poz.length > neg.length;
    }

    private static void getNumb(int num) {
        int n = 9;
        int res = n - num;
        System.out.println(num + "" + n + "" + res);
    }

    private static void getDegree(int n) {
//        int res = n * n;
        System.out.println(Math.pow(n, 2));

    }

    private static int getRes(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
