package org.example.learyard.patterns.number_patterns;

/**
N = 5

11111
22222
33333
44444
55555
 */

//https://read.learnyard.com/number-patterns-2/
public class Number_Pattern_1 {

    public static void main(String[] args) {
        int N = 5;
        printNumberPattern_1(N);
    }

    private static void printNumberPattern_1(int N) {
        for (int row = 1; row <= N; row++) {
            for (int column = 1; column <= N; column++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
