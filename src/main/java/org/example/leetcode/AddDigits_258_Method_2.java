package org.example.leetcode;



//https://leetcode.com/problems/add-digits/description/
public class AddDigits_258_Method_2 {

    public static void main(String[] args) {

//        int num = 38;
//        int num = 0;
//        int num = 14;
//        int num = 1;
        int num = 98;

        int sum = addDigits(num);
        System.out.println(sum);
    }

    private static int addDigits(int num) {
        int sum = 0, lastDigit = 0, sumDigits = 0;

        if (num == 0 || num == 1)
            return num;

        while (sumDigits != 1) {
            while (num > 0) {
                lastDigit = num % 10;
                sum += lastDigit;
                num /= 10;
                sumDigits++;
            }
            if (sumDigits != 1) {
                num = sum;
                sumDigits = 0;
                sum = 0;
            }
        }
        return sum;
    }
}
