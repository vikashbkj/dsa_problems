package org.example.codeforces;

import java.util.Scanner;

//005. Fizz Buzz
public class FizzBuzzSolution_005 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

//        int num = 15;
//        int num = 1000;
        int num = 1;
        String value = printFizzBuzz(num);
        System.out.println(value);
    }

    private static String printFizzBuzz(int num) {
        String value = "";
        if (num < 3)
            return value;
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                value = "FizzBuzz";
            } else if (i % 3 == 0) {
                value = "Fizz";
            } else if (i % 5 == 0) {
                value = "Buzz";
            }
        }
        return value;
    }
}