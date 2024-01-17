package org.example.learyard.patterns;

/**

N = 5
*****
  ****
    ***
      **
        *
      **
    ***
  ****
*****

 */

//https://read.learnyard.com/miscellaneous-star-pattern/
public class Right_Arrow_Pattern {

    public static void main(String[] args) {

        int N = 5;
        printRightArrowPattern(N);
    }

    private static void printRightArrowPattern(int N) {
        int num_spaces = 0;
        int num_stars = N;

        for (int row = 1; row <= N; row++) {

            // print spaces
            for (int spaces = 1; spaces <= num_spaces; spaces++) {
                System.out.print(" ");
            }

            // print stars
            for (int stars = 1; stars <= num_stars; stars++) {
                System.out.print("*");
            }

            num_spaces += 2;
            num_stars--;
            System.out.println();
        }

        num_spaces = (2 * N - 2) -2;
        num_stars = 2;

        for (int row = 1; row <= N -1; row++) {

            // print spaces
            for (int spaces = 1; spaces <= num_spaces; spaces++) {
                System.out.print(" ");
            }

            // print stars
            for (int stars = 1; stars <= num_stars; stars++) {
                System.out.print("*");
            }

            num_spaces -= 2;
            num_stars++;
            System.out.println();
        }
    }
}
