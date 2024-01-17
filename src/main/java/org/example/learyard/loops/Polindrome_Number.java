package org.example.learyard.loops;




//?https://read.learnyard.com/loops-2/
public class Polindrome_Number {

    public static void main(String[] args) {
        int N = 543345;
        boolean result = isNumberPolindrome(N);
        System.out.println(result);
    }

    private static boolean isNumberPolindrome(int N) {
        int original_num = N;

        int lastDigit = 0;
        int reverse = 0;

        while (N > 0) {
            lastDigit = N % 10;
            N /= 10;
            reverse = 10 * reverse + lastDigit;
        }
        return (original_num == reverse);
    }
}
