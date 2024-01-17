package org.example.learyard.loops;




//https://read.learnyard.com/loops-2/
public class Reverse_Number {

    public static void main(String[] args) {
        int N = 54321;
        int reverse = reverseNumber(N);
        System.out.println(reverse);
    }

    private static int reverseNumber(int N) {
        int lastDigit = 0;
        int reverse = 0;

        while (N > 0) {
            lastDigit = N % 10;
            N /= 10;
            reverse = 10 * reverse + lastDigit;
        }
        return reverse;
    }
}
