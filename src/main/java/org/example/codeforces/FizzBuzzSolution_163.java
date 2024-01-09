package org.example.codeforces;

import java.util.Scanner;
import java.lang.Integer;

public class FizzBuzzSolution_163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        String value = "";
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                value = "FizzBuzz";
            } else if (i % 3 == 0) {
                value = "Fizz";
            } else if (i % 5 == 0) {
                value = "Buzz";
            } else {
                value = Integer.toString(i);
            }
            System.out.println(value);
        }
    }
}
