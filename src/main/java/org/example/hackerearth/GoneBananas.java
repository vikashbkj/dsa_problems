package org.example.hackerearth;

import java.util.Scanner;




//https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/monks-problem-ffeebf8a/?purpose=login&source=problem-page&update=google
public class GoneBananas {

//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
//        int t = 1;
//
//        for (int i = 1; i <= t; ++i) {
////            int n = sc.nextInt();
////        int n = 2;
////        int n = 4;
//            int n = 85016;
//            System.out.println(solve(n));
//        }
////        sc.close();
//    }

    public static void main(String[] args) {
        int t = 10;
//        int a1 = 85016;
        int a1 = 84364;

//        int a2 = 83024;
        int a2 = 85048;

//        int a3 = 85080;
        int a3 = 80568;

//        int a4 = 81252;
        int a4 = 83312;

//        int a5 = 81296;
        int a5 = 81464;

//        int a6 = 81504;
        int a6 = 81604;

//        int a7 = 87248;
        int a7 = 83092;

//        int a8 = 83164;
        int a8 = 87352;

//        int a9 = 87456;
        int a9 = 85200;

//        int a10 = 85060;
        int a10 = 87224;

        int n = 0;
        for (int i = 1; i <= t; ++i) {
            if (i == 1)
                n = a1;
            else if (i == 2)
                n = a2;
            else if (i == 3)
                n = a3;
            else if (i == 4)
                n = a4;
            else if (i == 5)
                n = a5;
            else if (i == 6)
                n = a6;
            else if (i == 7)
                n = a7;
            else if (i == 8)
                n = a8;
            else if (i == 9)
                n = a9;
            else if (i == 10)
                n = a10;

            System.out.println(solve(n));
        }
    }

    static String solve(int N) {
        int counter = 1; //at least 1 distribution is possible if N >= 4

        if (N < 4) {
            return "No";
        }

        for (int k = 4; k <= N; k++){
            if (N % k == 0) {
                N = N / k;
                counter++;
            }
        }
        if(counter > 1)
            return "Yes";
        else
            return "No";
    }

    static boolean isPrimeNumber(int num) {
        if (num <= 1)
            return false;

        if (num == 2)
            return true;

        for (int k = 1; k * k <= num; ++k) {
            if (num % k == 0) {
                return false;
            }
        }
        return true;
    }

//    static String solve(int N) {
//        int sum = 0;
//        int counter = 0;
//        if (N <= 2) {
//            return "No";
//        }
//
//        while (N > 0) {
//            if (N % 2 == 0 || N % 3 == 0 || N % 5 == 0 || N % 7 == 0) {
//                sum += N % 10;
//                counter++;
//            }
//            N /= 10;
//        }
//        System.out.println("sum = " + counter);
//        if (sum > 2)
//            return "Yes";
//        else
//            return "No";
//    }
}
