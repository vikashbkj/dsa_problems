package org.example.codeforces;

import java.util.Scanner;




/**
 * Problem: A. Plus or Minus
 * https://codeforces.com/problemset/problem/1807/A
 *
 *  Inputs
 * 11 - t = number of test cases
 * 1 2 3 values of a, b and c
 * 3 2 1
 * 2 9 -7
 * 3 4 7
 * 1 1 2
 * 1 1 0
 * 3 3 6
 * 9 9 18
 * 9 9 0
 * 1 9 -8
 * 1 9 10
 */

//https://codeforces.com/problemset/problem/1807/A
public class APlusOrMinus_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a + b == c)
                System.out.println("+");
            else if (a - b == c) {
                System.out.println("-");
            }
        }
    }
}
