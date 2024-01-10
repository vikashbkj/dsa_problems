package org.example.leetcode;

public class UglyNumber_263_Method2 {

    public static void main(String[] args) {
//        int n = 6;
//        int n = 5;
//        int n = 3;
//        int n = 2;
//        int n = 9;
//        int n = 10;
//        int n = 12;
//        int n = 14;
        int n = 0;
//        int n = 1;
//        int n = 17;
//        int n = 18;
//        int n = 8;

        System.out.println(isUglyNumber(n));
    }

    private static boolean isUglyNumber(int n) {
        boolean isUgly = true;

        if (n <= 0)
            return false;

        if (n == 1)
            return true;

        for (int count = 4; count < n; count++) {
            if ((count != 5) && n % count == 0) {
                return false;
            }
        }
        return isUgly;
    }
}
