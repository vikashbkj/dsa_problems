package org.example.learyard.patterns.number_patterns;

/**
N = 5

12345
23456
34567
45678
56789
 */

//https://read.learnyard.com/number-patterns-2/
public class Number_Pattern_3 {

    public static void main(String[] args) {
        int N = 5;
        printNumberPattern_3(N);
    }

    private static void printNumberPattern_3(int N) {
        int num_counter = 0;
        for (int row = 1; row <= N; row++) {
            num_counter = row;
            for (int column = 1; column <= N; column++) {
                System.out.print(num_counter++);
            }
            System.out.println();
        }
    }
}
