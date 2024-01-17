package org.example.learyard.patterns;


/**
N = 5

*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *

 */

//https://read.learnyard.com/miscellaneous-star-pattern/
public class Cross_Pattern {

    public static void main(String[] args) {
        int N = 5;
        printCrossPattern(N);
    }

    private static void printCrossPattern(int N) {

        int limit = 2 * N -1; // total number of characters stars + spaces
        for (int row = 1; row <= limit; row++) {
            for (int column = 1; column <= limit; column++) {

                if (row == column) // first diagonal
                    System.out.print("*");
                else if (column == limit - row + 1){ // second diagonal
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
