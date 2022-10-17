package ru.gb.Java_Erlan.lesson_4;

public class practice {
    public static void main(String[] args) {

        // int[] array = {3, 7, 9, 14, 29};
        // getRes(5, array);
        //getMark(5, array);

        //int[] array = {5678765, 787890, 445678965};
        //getMax(array);

        // int[] array = {8, 54};
        //getPr(array);

       // int[] array = {3, 14, -9, 4, -5, 1, -12, 4};
     //   getSum(8, array);
    }

    public static void getRes(int n, int[] array) {
        int[] arrpos = new int[n];
        int[] arrneg = new int[n];
        int neg = 0;
        int poz = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                arrpos[poz] = array[i];
                poz += 1;
            } else {
                arrneg[neg] = array[i];
                neg += 1;
            }
        }
        for (int i = 0; i < arrpos.length; i++) {
            System.out.print(arrpos[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrneg.length; i++) {
            System.out.print(arrneg[i] + " ");
        }
        if (neg < poz) {
            System.out.println("Yes");
        } else {
            System.out.println();
            System.out.println("No");
        }
    }


    public static void getMark(int n, int[] mass) {
        int neg = 0;
        int poz = 0;
        for (int i = 0; i < n; i++) {
            if (mass[i] % 2 == 0) {
                System.out.print(mass[i] + " ");
                poz += 1;
            }
        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            if (mass[j] % 2 != 0) {
                System.out.print(mass[j] + " ");
                neg += 1;
            }
        }
        System.out.println();
        if (neg < poz) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }

    public static void getPr(int[] numbs) {
        int n = 432;
        int resNumb = 1;
        for (int i = 0; i < numbs.length; i++) {
            resNumb = resNumb * numbs[i];
        }
        if (resNumb == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void getSum(int n, int[] arr) {
        int poz = 0;
        int min = 0;
        int max = 0;
        int res = 1;
        int indMin = 0;
        int indMax = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                poz += arr[i];
            }
        }
        System.out.print(poz + ", ");
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                indMin = i;
            }
            if (max < arr[i]) {
                max = arr[i];
                indMax = i;
            }
        }
        if (indMin < indMax) {
            for (int j = indMin + 1; j < indMax; j++) {
                res = res * arr[j];
            }
        } else {
            for (int j = indMax + 1; j < indMin; j++) {
                res = res * arr[j];
            }
        }

        System.out.println(res + " ");
    }
}



