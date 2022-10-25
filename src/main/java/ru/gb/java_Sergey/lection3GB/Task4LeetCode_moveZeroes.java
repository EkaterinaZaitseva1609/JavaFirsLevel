package ru.gb.java_Sergey.lection3GB;

import java.util.Arrays;

public class Task4LeetCode_moveZeroes {
    public static void main(String[] args) {
       int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int copyIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[copyIndex] = nums[i];
                copyIndex ++;
            }
        }
        while (copyIndex < nums.length) {
            nums[copyIndex] = 0;
            copyIndex++;
        }
    }
}
