package org.example.learyard.patterns;


/**

 N = 5
     *
    * *
   *   *
  *     *
 *********

 N = 10
          *
         * *
        *   *
       *     *
      *       *
     *         *
    *           *
   *             *
  *               *
 *******************

 */

//https://read.learnyard.com/pyramid-star-pate/
public class Hollow_Pyramid_Pattern {

    public static void main(String[] args) {
        int N = 10;
        printHollowPyramid(N);
    }

    static void printHollowPyramid(int N) {
        int numberOfStars = 1;
        int numberOfSpaces = 0;

        for (int row = 1; row <= N; row++) {

            for (int column = 1; column <= N - row; column++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= numberOfStars; i++) {

                System.out.print("*");

                if (row != N) { // no spaces for last row
                    for (int j = 1; j<= numberOfSpaces; j++) {
                        System.out.print(" ");
                    }
                }
            }

            if (row == 1) {
                numberOfSpaces = 1;
            } else {
                numberOfSpaces += 2;
            }

            if (row == N - 1) { // set number of stars for last row
                numberOfStars = numberOfSpaces + numberOfStars;
            } else {
                numberOfStars = 2;
            }


            System.out.println();
        }
    }
}
