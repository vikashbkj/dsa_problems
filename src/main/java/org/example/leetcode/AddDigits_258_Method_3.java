package org.example.leetcode;



//https://leetcode.com/problems/add-digits/description/
public class AddDigits_258_Method_3 {

    public static void main(String[] args) {
//        int num = 38;
//        int num = 0;
//        int num = 14;
//        int num = 1;
//        int num = 98;
//        int num = 165;
//        int num = 101;
        int num = 100;

        int sum = addDigits(num);
        System.out.println(sum);
    }

    private static int addDigits(int num) {
        int sum = 0, lastDigit = 0, sumDigitsCounter = 0;

        if (num == 0 || num == 1)
            return num;

        while (num > 0) {
            lastDigit = num % 10;
            num /= 10;
            sum += lastDigit;
            sumDigitsCounter++;
        }

        if (sumDigitsCounter != 1) {
//            addDigits(sum); // !! Fails !!
            return addDigits(sum);
        }

        return sum;
    }
}
