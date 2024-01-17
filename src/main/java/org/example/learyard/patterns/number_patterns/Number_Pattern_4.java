package org.example.learyard.patterns.number_patterns;

/**
N = 5

1  2  3  4  5
6  7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
 */

//https://read.learnyard.com/number-patterns-2/
public class Number_Pattern_4 {

    public static void main(String[] args) {
        int N = 5;
        printNumberPattern_4(N);
    }

    private static void printNumberPattern_4(int N) {
        int num_counter = 1;
        for (int row = 1; row <= N; row++) {
            for (int column = 1; column <= N; column++) {
                System.out.print(" " + num_counter++ + " ");
            }
            System.out.println();
        }
    }
}
