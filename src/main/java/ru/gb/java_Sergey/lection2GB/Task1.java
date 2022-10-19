package ru.gb.java_Sergey.lection2GB;

public class Task1 {
    public static void main(String[] args) {
//       int n = 234;
//       prodAndSum(n);

//        String a = "11";
//        String b = "1";
//        System.out.println(addBinary(a, b));

        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    private static String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }


    private static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        ;

        int carry = 0;
        int j = b.length() - 1;
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carry += 1;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carry += 1;
            }
            res = carry % 2 + res;
            carry /= 2;
            j--;
        }
        if (carry == 1) {
            res = 1 + res;
        }
        return res;
    }

    private static void prodAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            prod *= digit;
            sum += digit;

            n /= 10;
        }
        System.out.println(prod - sum);
    }

}
