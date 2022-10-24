package ru.gb.java_Sergey.home_work_2;

public class Hanoi_task_1 {
    public static void hanoi(char a, char b, char c, int count) {

        if (count == 1) {
            System.out.println(String.format("from %s to %s", a, b));
        } else {
            hanoi(a, c, b, count - 1);
            System.out.println(String.format("from %s to %s", a, b));
            hanoi(c, b, a, count - 1);
        }
    }
}
