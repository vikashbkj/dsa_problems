package org.example.leetcode;



//https://leetcode.com/problems/ugly-number/
public class UglyNumber_263 {

    public static void main(String[] args) {
//        int n = 6;
//        int n = 14;
//        int n = 8;
//        int n = 0;
//        int n = 1;
//        int n = 1332185066;

//        int n = 9;
//        int n = 10;
//        int n = 12;
//        int n = 17;
        int n = 18;


        System.out.println(isUglyNumber(n));
    }

    private static boolean isUglyNumber(int n) {
        if (n <= 0)
            return false;

        if (n == 1)
            return true;

        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }

        System.out.println("n = " + n);
        return (n == 1);
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 2)
            return true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
