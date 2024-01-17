package org.example.leetcode;




//https://leetcode.com/problems/happy-number/description/
public class Happy_Number_202 {

    public static void main(String[] args) {
//        int n = 1111111;
        int n = 19;
//        int n = 2;
//        int n = 7;
//        int n = 3;
//        int n = 4;
//        int n = 5;
//        int n = 6;
//        int n = 1;

//        int n = 1111111;// 7 1's
//        int n = 11;
//        int n = 111;
//        int n = 1111; // 4 1's
//        int n = 11111;  // 5 1's
//        int n = 111111; // 6 1's
//        int n = 1111111; // 7 1's'
//        int n = 12;
//        int n = 13;
//        int n = 14;
//        int n = 15;
//        int n = 16;
//        int n = 17;
//        int n = 18;
//        int n = 20;
//        int n = 21;
//        int n = 22;
//        int n = 23;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int num) {
        int sum = 0, tempSum = 0, lastDigit = 0;
        int sumDigits = 0;
        int lastNum = 0;

        if (num <= 0)
            return false;

        if (num == 1)
            return true;

        while (num > 0) {
            while (num > 0) {
                lastDigit = num % 10;
                num  /= 10;
                sum += lastDigit * lastDigit; // sum of square of digits
            }
//            System.out.println("SUM = " + sum);
            tempSum = sum;
            while (tempSum > 0) {
                tempSum /= 10;
                sumDigits++;
            }
//            System.out.println("SUM = " + sum + " lastNum = "+ lastNum + " sumDigits = " + sumDigits);
            if (sumDigits == 1) {
                if (sum == 1)
                    return true;
                else if (sum == lastNum) // cycle is found
                    return false;
                else {
                    lastNum = sum; // storing value to identify cycle
                    num = sum;
                    sum = 0;
                    sumDigits = 0;
                }
            } else {
                num = sum;
                sum = 0;
                sumDigits = 0;
            }
        }
        return true;
    }
}
