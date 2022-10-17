package ru.gb.Java_Erlan.lesson_1;
// Домашнее задание 1
public class Lesson1 {
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean isRange(int a, int b) {
        int sum = a + b;
        return (sum > 10 && sum < 20);
    }

    public static void getRes(int num) {
        if (num >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        return (a < 0);
    }

    public static void getName (String name) {
        System.out.println("Привет, " + name );
    }

    public static void main(String[] args) {
        // int res = calculate(2, 3, 5, 4);
        // System.out.println(res);

        //  boolean res = isRange(5, 7);
        // System.out.println(res);

        // getRes(7);

       // boolean res = isNegative (-78);
        //System.out.println(res);

        //getName("Буклюня!");


    }


        /*
    byte newByte = -127;
    short newShort = 32766;
    char newChar = a;
    int newInt = 35;
    long newLong = 9227889l;
    float newFloat = 3.14f;
    double newDouble = 4.9;
    boolean newBoll = true;
    String newString = "hello, moon";
    */
        /*
        int a = 6;
        double b = 10.77;
        int c = 4;
        int d = 8;
        double res = a * (b + (c / d));
        System.out.println("результат " + res);
*/

        /*
        int a = 11;
        int b = 16;
        int c = a + b;
        if (c > 10 & c < 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

         */
        /*
        int num = 67;
        if (num >= 0) {
            System.out.println(num + " положительное число");
        } else {
            System.out.println(num + " отрицательное число");
        }
        */
/*
        int a = -44;
        int b = 0;
        boolean c = a <= b;
        System.out.println(c);

 */
       /*
        String name = "Masha";
        System.out.println("Hello, " + name);

        */

        /*
        int day = 365;
        int VisDay = 366;
        if (day > VisDay) {
            System.out.println("Это обычный год, в нем " + day + " дней.");
        } else {
            System.out.println("Это високосный год, в нем " + VisDay + " дней");
        }

         */

}

