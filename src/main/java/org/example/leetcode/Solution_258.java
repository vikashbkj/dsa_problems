package org.example.leetcode;

class Solution_258 {
    int sum = 0;
    int sumDigitsCounter = 0;

    public int addDigits(int num) {
        if (num == 0)
            return num;

        while (sumDigitsCounter != 1) {
            sumDigitsCounter = 0;
            sum = sumOfDigits(num);
            num = sum;
        }
        return sum;
    }

    private int sumOfDigits(int num) {
        int result = 0;
        int lastDigit = 0;
        while (num > 0) {
            lastDigit = num % 10;
            num = num / 10;
            result = result + lastDigit;
            sumDigitsCounter++;
        }
        return result;
    }

//     private int numberOfDigits(int num) {
//         int digits = 0;
//         while (num > 0) {
//             num = num / 10;
//             digits++;
//         }
//         return digits;
//     }
}