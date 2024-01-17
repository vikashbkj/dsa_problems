package org.example.learyard.patterns.number_patterns;

/**
N = 5

55555
44445
33345
22345
12345
 */
public class Number_Pattern_6 {

    public static void main(String[] args) {
        int N = 5;
        printNumberPattern_6(N);
    }

    private static void printNumberPattern_6(int N) {
        for (int row = N; row >= 1; row--) {

            for (int column = 1; column <= row ; column++) { // prints pattern like inverted right triangle
                System.out.print(row);
            }

            int num_counter = row;
            for (int p = 1; p <= N -row; p++) { // similar to printing space at the beginning of row
                System.out.print(++num_counter);
            }
            System.out.println();
        }
    }
}
