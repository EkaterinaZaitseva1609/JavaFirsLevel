package ru.gb.java_Sergey.home_work_2;

import java.util.Arrays;

public class Sort_task_2 {
    public static void sort(int[] array) {
        for (int left = 1; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
