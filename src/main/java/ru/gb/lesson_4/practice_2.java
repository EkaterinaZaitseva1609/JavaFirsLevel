package ru.gb.lesson_4;

import java.util.Random;

public class practice_2 {
    public static void main(String[] args) {

        //  int[][]matrix = {
        //           {5, 6, 7, 1},
        //          {7, 2, 5, 1}
        //  };
        // getAnswer(matrix);

        // String data = "2345 2643";
        //getRes(data);

        //int n1 = 36, n2 = 27, gcd = 1;
/*
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        int lcm = (n1 * n2) / gcd;
        System.out.print(lcm);

 */
        // int n = 5;
        //int [][] mass = new int [n][n];
        //getRoad(mass, n);

        int n = 5;
        getSum(n);

    }


    public static void getAnswer(int[][] matrix) {
        int resW = 0;
        int resM = 0;
        int resultW = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == matrix[1][i]) {
                resM += 1;
            }
        }
        System.out.print(resM + ", ");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[0][i] == matrix[1][j]) {
                    resW += 1;
                }
            }
        }
        resultW = resW - resM;
        System.out.println(resultW);
    }

    public static void getRes(String inputData) {
        String[] mass = inputData.split(" ");
        String firsNum = mass[0];
        System.out.println(firsNum);
        String secondNum = mass[1];
        int resM = 0;
        int resW = 0;
        int resultW = 0;
        System.out.println(secondNum);
        if (firsNum.equals(secondNum)) {
            System.out.println(firsNum.length());
        } else {
            for (int i = 0; i < firsNum.length(); i++) {
                if (firsNum.charAt(i) == secondNum.charAt(i)) {
                    resM += 1;
                }
            }
        }
        System.out.println(resM);
        for (int i = 0; i < firsNum.length(); i++) {
            for (int j = 0; j < secondNum.length(); j++) {
                if (firsNum.charAt(i) == secondNum.charAt(j)) {
                    resW += 1;
                }
            }
        }
        resultW = resW - resM;
        System.out.println(resultW);
    }

    public static void getRoad(int[][] mass, int n) {
        Random random = new Random();
        int res = 0;
        int res2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = random.nextInt(2);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mass[i][j] == 1) {
                    res += 1;
                }
            }
        }
        res2 = res / 2;
        System.out.println(res2);
    }

    public static void getSum(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            // System.out.println("\n");
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(j);

                }
            }
            System.out.println();
        }

    }
}


