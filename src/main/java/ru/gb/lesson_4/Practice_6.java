package ru.gb.lesson_4;

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
