package org.example.learyard.patterns;

/**

N = 5

    +
    +
    +
    +
+++++++++
    +
    +
    +
    +

 */

//https://read.learnyard.com/miscellaneous-star-pattern/
public class Plus_Sign_Pattern {

    public static void main(String[] args) {
        int N = 5;
        printPlusSignPattern(N);
    }

    private static void printPlusSignPattern(int N) {
        int num_plus = 1;
        int num_spaces = 4;

        for (int row = 1; row <= N; row++) {

            // print spaces
            for (int spaces = 1; spaces <= num_spaces; spaces++) {
                System.out.print(" ");
            }

            // print plus sign +
            for (int plus = 1; plus <= num_plus; plus++) {
                System.out.print("+");
            }

            if (row == N -1) {
                num_plus = 2 * N -1;
                num_spaces = 0;
            }
            System.out.println();
        }

        num_plus = 1;
        num_spaces = 4;

        for (int row = 1; row <= N -1; row++) {

            // print spaces
            for (int spaces = 1; spaces <= num_spaces; spaces++) {
                System.out.print(" ");
            }

            // print plus sign +
            for (int plus = 1; plus <= num_plus; plus++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
