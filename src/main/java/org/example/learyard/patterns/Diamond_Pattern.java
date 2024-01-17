package org.example.learyard.patterns;


/**

N = 3
   *
  ***
 *****
  ***
   *

N = 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */

//https://read.learnyard.com/miscellaneous-star-pattern/
public class Diamond_Pattern {

    public static void main(String[] args) {

        int N = 5;
        printDiamondPattern(N);
    }

    private static void printDiamondPattern(int N) {
        int num_stars = 1;

        for (int row = 1; row <= N; row++) {

            for (int spaces = 1; spaces <= N - row; spaces++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num_stars; k++) {
                System.out.print("*");
            }
            num_stars += 2;
            System.out.println();
        }

        num_stars = num_stars -2;

        for (int row = N; row >= 1; row--) {

            for (int spaces = 1; spaces <= N - row; spaces++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num_stars; k++) {
                System.out.print("*");
            }
            num_stars -= 2;
            System.out.println();
        }
    }
}
