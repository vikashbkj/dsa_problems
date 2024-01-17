package org.example.learyard.patterns;



/**
N = 5

 *****
 ** **
 * * *
 ** **
 *****

 N = 10

 **********
 **      **
 * *    * *
 *  *  *  *
 *   **   *
 *   **   *
 *  *  *  *
 * *    * *
 **      **
 **********

 */

//https://read.learnyard.com/square-star-and-rhombus-start-patterns/
public class Hollow_Square_With_Diagonal_Pattern {

    public static void main(String[] args) {
        int N = 10;
        printHollowSquareWithDiagonal(N);
    }

    static void printHollowSquareWithDiagonal(int N) {

        for (int row = 1; row <= N; row++) {

            for (int column = 1; column <= N; column++) {
                if (row == 1 || row == N) {
                    System.out.print("*");
                } else if (column == 1 || column == N) {
                    System.out.print("*");
                } else if (row == column) { // diagonal
                    System.out.print("*");
                } else if (column == N - row + 1){ // reverse diagonal
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
