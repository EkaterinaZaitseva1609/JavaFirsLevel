package ru.gb.leetCode;

import java.util.Arrays;

public class Task1_MergeSortedArray {
    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m = 3;
//        int n = 3;
//        merge(nums1, nums2, m, n);

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        getMerge(nums1, nums2, m, n);
    }
 // сложное и быстрое решение от преподавателя
    private static void getMerge(int[] nums1, int[] nums2, int m, int n) {
        if (n == 0) return;

        int last = n + m - 1;
        m = m - 1;
        n = n - 1;

        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[last--] = nums1[m--];
            } else {
                nums1[last--] = nums2[n--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
// более простое решение, но выполняется значительно дольше
    private static void merge(int[] nums1, int[] nums2, int m, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
