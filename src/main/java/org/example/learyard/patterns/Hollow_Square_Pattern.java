package org.example.learyard.patterns;



/**

 N = 5
 *****
 *   *
 *   *
 *   *
 *****

 N = 10
 **********
 *        *
 *        *
 *        *
 *        *
 *        *
 *        *
 *        *
 *        *
 **********

 */

//https://read.learnyard.com/square-star-and-rhombus-start-patterns/
public class Hollow_Square_Pattern {

    public static void main(String[] args) {
        int N = 10;
        printHollowSquare(N);
    }

    static void printHollowSquare(int N) {

        for (int row = 1; row <= N; row++) {

            for (int column = 1; column <= N; column++) {
                if (row == 1 || row == N) { // for first and last row print all stars no space
                    System.out.print("*");
                } else if (column == 1 || column == N){ // for first and last column in a row print star
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
