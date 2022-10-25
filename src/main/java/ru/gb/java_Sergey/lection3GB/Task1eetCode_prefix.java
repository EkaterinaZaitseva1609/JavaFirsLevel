package ru.gb.java_Sergey.lection3GB;

public class Task1eetCode_prefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length()-1);
                if (res.isEmpty()) {
                    return "";
                }
            }

        }
        return res;
    }
}



