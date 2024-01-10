package org.example.leetcode;

import java.util.Scanner;

//https://leetcode.com/problems/number-of-common-factors/description/
public class NumberOfCommonFactors_2427 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        int a = 12;
//        int b = 6;

//        int a = 25;
//        int b = 30;

        int a = 885;
        int b = 885;

        System.out.println(commonFactors(a, b));
    }

    private static int commonFactors(int a, int b) {
        int commonFactorCounter = 0;

        int largest = a > b ? a : b;
        for (int i = 1; i <= largest; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("common factor = " + i);
                commonFactorCounter++;
            }
        }
        return commonFactorCounter;
    }
}
