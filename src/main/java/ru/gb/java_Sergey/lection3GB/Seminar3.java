package ru.gb.java_Sergey.lection3GB;

public class Seminar3 {
    public static void main(String[] args) {
        System.out.println(solve(2, 6));
    }

     static int solve(int s, int e) {
        int[]f = new int [e + 1];
        f[s] = 1;
         for (int item = s + 1; item <= e; item++) {
             if (item % 2 == 0) {
                 f[item] = f[item - 1] + f[item / 2];
             } else {
                 f[item] = f[item - 1];
             }
         }
         return f[e];
    }
}
