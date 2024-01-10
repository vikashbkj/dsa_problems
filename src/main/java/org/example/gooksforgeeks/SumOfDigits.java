package org.example.gooksforgeeks;




//https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
public class SumOfDigits {

    public static void main(String[] args) {
//        int N = 87;
//        int N = 8850;
        int N = 1468;

        int lastDigit = 0, sum = 0;
        while (N > 0) {
            lastDigit = N % 10;
            N = N / 10;
            sum += lastDigit;
        }

        System.out.println(sum);
    }
}
