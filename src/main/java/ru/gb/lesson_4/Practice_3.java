package ru.gb.lesson_4;

import javax.print.attribute.standard.MediaSize;

public class Practice_3 {

    public static void main(String[] args) {

        //  int n = 10;
        // getRes(n);

        //  int n = 7;
        // Factorial(n);


        //checkSalary(100, 500, 1000);

        //int n = 5;
       // converter(n);
    }

    private static void converter(int n) {
        int res = 0;
       while (n != 0) {
                res = n % 2;
            }
        }



    public static void getRes(int n) {
        int kub = 1;
        int count = 0;
        while (n > 0 && n >= count) {
            n = n - kub;
            kub++;
            count++;
        }
        System.out.println(count);
    }

    public static void Factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }


    public static void checkSalary(int firstWorker, int secondWorker, int thirdWorker) {
        int maxS = firstWorker;
        int minS = firstWorker;
        int res = 0;
        if (firstWorker > secondWorker) {
            minS = secondWorker;
            if (secondWorker > thirdWorker) {
                minS = thirdWorker;
            }
        }
        if (firstWorker < secondWorker) {
            maxS = secondWorker;
            if (secondWorker < thirdWorker) {
                maxS = thirdWorker;
            }
        }
        res = maxS - minS;
        System.out.println(res);
    }


}

