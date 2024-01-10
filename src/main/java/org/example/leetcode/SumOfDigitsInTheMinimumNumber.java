package org.example.leetcode;

import java.util.Arrays;



//https://hackmd.io/@kenjin/r1yKCiF_r#:~:text=Example%201%3A,so%20the%20answer%20is%200.
public class SumOfDigitsInTheMinimumNumber {

    public static void main(String[] args) {
//        int[] arr = { 34,23,1,24,75,33,54,8 };
        int[] arr = { 99,77,33,66,55 };

        int sum = sumOfDigitsOfMinimumNumber(arr);
        System.out.println(sum);
    }

    private static int sumOfDigitsOfMinimumNumber(int[] arr) {
        int sum = 0, lastDigit = 0;
        if (arr.length <= 0)
            return 0;

        Arrays.sort(arr);
        int num = arr[0];

        if (num <= 0)
            return 0;
        while (num > 0) {
            lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        if (sum % 2 == 0)
            return 1;
        else
            return 0;
    }
}
