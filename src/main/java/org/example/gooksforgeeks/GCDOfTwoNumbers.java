package org.example.gooksforgeeks;

import java.util.Scanner;

/**
 * Given two positive integers A and B, find GCD of A and B.
 * //https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
 */
public class GCDOfTwoNumbers {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        int a = 3;
//        int b = 6;

//        int a = 15;
//        int b = 45;

//        int a = 21;
//        int b = 28;

//        int a = 12;
//        int b = 27;

//        int a = 90;
//        int b = 135;

//        int a = 36;
//        int b = 54;

        int a = 18;
        int b = 20;

        int lastCommonFactor = 0;
        int largest = a > b ? a : b;

        for (int i = 1; i < largest; i++) {
            if (a % i == 0 && b % i == 0) {
                if (lastCommonFactor < i)
                    lastCommonFactor = i;
            }
        }
        System.out.println(lastCommonFactor);
    }
}
