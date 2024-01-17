package org.example.learyard.loops;



//https://read.learnyard.com/loops-2/
public class Factorial_Of_Number {

    public static void main(String[] args) {
        int N = 4;
        int factorial = factorialOfNumber(N);
        System.out.println(factorial);
    }

    private static int factorialOfNumber(int N) {
        int factorial = 1;

        while (N >= 1){
            factorial = factorial * N;
            N--;
        }
        return factorial;
    }
}
