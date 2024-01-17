package org.example.learyard.patterns.number_patterns;

/**
N = 5

12345
12345
12345
12345
12345
 */

//https://read.learnyard.com/number-patterns-2/
public class Number_Pattern_2 {
    public static void main(String[] args) {
        int N = 5;
        printNumberPattern_2(N);
    }

    private static void printNumberPattern_2(int N) {
        for (int row = 1; row <= N; row++) {
            for (int column = 1; column <= N; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
