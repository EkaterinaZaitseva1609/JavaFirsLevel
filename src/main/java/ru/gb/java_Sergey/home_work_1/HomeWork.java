package ru.gb.java_Sergey.home_work_1;

import java.util.Scanner;

public class HomeWork {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int [] arr = {15, 3, 45, -76, 12, 4, 457, 5, 17};
        heapSort(arr);
        System.out.println("HeapSort");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");



//        System.out.println("Укажите число n");
//        int n = scanner.nextInt();
//        getTriengle(n);

    }
    //Реализовать алгоритм пирамидальной сортировки (HeapSort)
    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 -1; i >= 0 ; i--)
            heap(arr, i, n);

        for (int i = n-1; i >=0 ; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heap(arr, 0, i);
        }
    }

    private static void heap(int[] arr, int i, int n) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;

        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heap(arr, largest, n);
            
        }
    }

    //Написать программу вычисления n-ого треугольного числа.
    private static void getTriengle(int n) {
        int x = 0;
            x = (n * (n + 1) / 2);
        System.out.println(x);
    }
}
