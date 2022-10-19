package ru.gb.java_Sergey.lection2GB;

public class Task3LeetCode_palindrome {

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        rev = (reverse(x, rev));

        return (x == rev);
    }
    private static int reverse(int x, int rev) {
        if (x == 0) {
            return rev;
        }

        rev = rev * 10 + (x % 10);
        rev = reverse(x / 10, rev);
        return rev;
    }
}
