package org.example.learyard.patterns;


/**

N = 5
 *
 **
 * *
 *  *
 *****

 N = 10
 *
 **
 * *
 *  *
 *   *
 *    *
 *     *
 *      *
 *       *
 **********

 */

//https://read.learnyard.com/triangle-pattern/
public class Hollow_Right_Triangle_Pattern {

    public static void main(String[] args) {
        int N = 10;
        printHollowRightTriangle(N);
    }

    private static void printHollowRightTriangle(int N) {
        int num_stars = 1;
        int num_spaces = 0;

        for (int row = 1; row <= N; row++) {
            for (int k = 1; k <= num_stars; k++) {
                System.out.print("*");

                if (row != N) {
                    for (int i = 1; i <= num_spaces; i++) {
                        System.out.print(" ");
                    }
                }
            }

            if (row == N -1) {
                num_stars = N;
            } else {
                num_stars = 2;
            }
            if (row != 1) {
                num_spaces++;
            }

            System.out.println();
        }
    }
}
