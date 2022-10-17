package ru.gb.Java_Erlan.lesson_4;

public class Practice_6 {

    public static void main(String[] args) {

        // int n = 58;
        // getConvert(n);

        // int n = 10;
        //getRes(n);

        // int a = 5;
        //int b = 7;
        //getAnswer(a, b);

        //double[] massX = {1, 1, 1};
        //double[] massY = {4, 4, 1};
        //getDifferent(massX, massY);

        int[][] array = new int[5][5];
        int w, h, n;
        int xA1, yA1, xA2, yA2;
        int xB1, yB1, xB2, yB2;
        getAria(array, 5, 5, 2, 1, 1, 3, 3, 2, 2, 4, 4);

    }

    private static void getAria(int[][] array, int w, int h, int n, int xA1, int yA1, int xA2, int yA2, int xB1, int yB1, int xB2, int yB2) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }




    private static void getDifferent(double[] massX, double[] massY) {
        double dFirst = 0;
        double dSecond = 0;
        double d = 0;
        double res = 0;

        dFirst = Math.pow((massX[0] - massY[0]), 2);
        dSecond = Math.pow((massX[1] - massY[1]), 2);
        dSecond += dFirst;

        //Извлечение корня
        d = Math.sqrt(dSecond);

        // Общая точка
        res = (massX[2] + massY[2]);
        if (res < d) {
            System.out.println("NO");
        } else {
            System.out.println("Yes");
        }

    }

    // Простая задача на больше, меньше
    private static void getAnswer(int a, int b) {
        if (a > b) {
            System.out.println(">");
        }
        if (a < b) {
            System.out.println("<");
        } else {
            System.out.println(" = ");
        }

    }

    // Нахождение всех натуральных делителей для числа n и их суммы
    private static void getRes(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(res);
    }

    //Перевод из десятичной в двоичную
    private static void getConvert(int n) {
        int res = 0;
        int count = 0;
        while (n != 0) {
            res = n % 2;
            System.out.print(res);
            n = n / 2;
            if (res == 1) {
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
