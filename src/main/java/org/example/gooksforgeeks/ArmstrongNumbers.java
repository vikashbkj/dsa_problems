package org.example.gooksforgeeks;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrongNumber(n));
    }

    static String armstrongNumber(int n){
        int N = n;
        int lastDigit = 0, sum = 0;

        while(n > 0) {
            lastDigit = n % 10;
            sum += lastDigit * lastDigit * lastDigit;
            n /= 10;
        }
        if(N == sum) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
