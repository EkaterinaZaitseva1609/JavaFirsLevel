package ru.gb.java_Sergey.lection2GB;

public class Task2leetCode_sum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);

    }

    private static int[] twoSum(int[] nums, int target) {
        int result = 0;
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                result = nums[i] + nums[j];
                if (result == target) {
                    res[0] = i;
                    res[1] = j;
                }

            }
        }
        return res;
    }
}


