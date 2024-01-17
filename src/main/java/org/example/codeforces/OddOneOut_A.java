package org.example.codeforces;

import java.util.Scanner;

public class OddOneOut_A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            findOddOneOut(sc);
        }
    }

    private static void findOddOneOut(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b)
            System.out.println(c);
        else if (b == c)
            System.out.println(a);
        else if (a == c)
            System.out.println(b);
    }
}