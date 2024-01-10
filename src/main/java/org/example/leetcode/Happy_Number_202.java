package org.example.leetcode;




//https://leetcode.com/problems/happy-number/description/
public class Happy_Number_202 {

    public static void main(String[] args) {

//        int n = 19;
//        int n = 2;
//        int n = 3;
//        int n = 4;
//        int n = 5;
//        int n = 6;
//        int n = 7;
//        int n = 1;
//        int n = 1111111; 7 1's
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
        int n = 23;
        System.out.println(isHappyNumber(n));
    }

    private static boolean isHappyNumber(int num) {
        int N = num;
        int sum = 0, lastDigit = 0, digitsCounter = 0;

        if (num <= 0)
            return false;

        while (num > 0) {
            num /= 10;
            digitsCounter++;
        }

        while (digitsCounter != 0) {
            lastDigit = N % 10;
            N = N / 10;
            sum += lastDigit * lastDigit;
            digitsCounter--;
            System.out.println("sum = " + sum + " digitsCounter = " + digitsCounter + " lastDigit = " + lastDigit);
        }

        if (sum != 1) {
            return isHappyNumber(sum);
        }
        return true;
    }
}
