package ru.gb.java_Sergey.home_work_2;

import java.util.Arrays;

import static ru.gb.java_Sergey.home_work_2.Hanoi_task_1.hanoi;
import static ru.gb.java_Sergey.home_work_2.Sort_task_2.sort;

public class Main {
    public static void main(String[] args) {

//        int count = 5;
//        hanoi('A', 'B', 'C', count);

        int[] array = {0, 22, -10, 4, -3, 28, 95};
        System.out.println(Arrays.toString(array));
        sort(array);



    }

}



