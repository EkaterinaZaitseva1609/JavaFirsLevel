package ru.gb.leetCode;

import java.util.Arrays;

public class Task3_RemoveElement {
    public static void main(String[] args) {
//        int[] nums = {3,2,2,3};
//        int val = 3;
//        System.out.println(removeElement(nums, val));

        int[] nums1 = {3, 3, 2, 2, 1, 3};
        int val1 = 3;
        System.out.println(getElem(nums1, val1));
    }

    private static int getElem(int[] nums1, int val1) {
        for (int i = 0; i < nums1.length-1; i++) {
            if (nums1[i] == val1) {
                nums1[i] = nums1[i + 1];
            }
        }
        return nums1[0];
    }

    private static int removeElement(int[] nums, int val) {
       int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {

                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];

                }
                nums[nums.length-1] = -1;
            } else {
                sum++;
            }
        }
        return sum;
    }
}
