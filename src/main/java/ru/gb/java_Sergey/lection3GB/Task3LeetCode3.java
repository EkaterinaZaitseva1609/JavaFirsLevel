package ru.gb.java_Sergey.lection3GB;

public class Task3LeetCode3 {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pq";
        System.out.println(alternat(word1, word2));


    }

    public static String alternat(String word1, String word2) {
        int maxlength = Math.max(word1.length(), word2.length());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < maxlength; i++) {
           if(i < word1.length()) {
               ans.append(word1.charAt(i));
           }
            if(i < word2.length()) {
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }
}
