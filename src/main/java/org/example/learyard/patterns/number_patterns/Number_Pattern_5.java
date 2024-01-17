package org.example.learyard.patterns.number_patterns;

/**
N = 5

55555
54444
54333
54322
54321
 */

//https://read.learnyard.com/number-patterns-2/
public class Number_Pattern_5 {


    public static void main(String[] args) {
        int N = 5;
        printNumberPattern_5(N);
    }

    private static void printNumberPattern_5(int N) {

        for (int row = N; row >= 1; row--) {

            int num_counter = N;
            for (int p = 1; p <= N -row; p++) { // similar to printing space at the beginning of row
                System.out.print(num_counter);
                num_counter--;
            }
            for (int column = 1; column <= row ; column++) { // prints pattern like inverted right triangle
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
