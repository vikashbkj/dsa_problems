package org.example.learyard.patterns;

/**

 N = 5
 *********
  *     *
   *   *
    * *
     *

 N = 10
 *******************
  *               *
   *             *
    *           *
     *         *
      *       *
       *     *
        *   *
         * *
          *

 */

//https://read.learnyard.com/pyramid-star-pate/
public class Hollow_Inverted_Pyramid_Pattern {

    public static void main(String[] args) {
        int N = 10;
        printInvertedPyramid(N);
    }

    static void printInvertedPyramid(int N) {
        int numberOfStars = 2 * N -1;
        int numberOfSpaces = numberOfStars - 2; // at the end of the loop in each iteration value of spaces between the stars is set

        for (int row = N; row >= 1; row--) {

            for (int i = 1; i <= N -row; i++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= numberOfStars; k++) {
                System.out.print("*");
                if (row != 1 && row != N) { // no space between stars at first and last line
                    for (int j = 1; j <= numberOfSpaces; j++) {
                        System.out.print(" ");
                    }
                }
            }

            if (row == 2) {
                numberOfStars = 1;
            } else {
                numberOfStars = 2;
            }

//            System.out.println("row = " + row + " numberOfSpaces = " + numberOfSpaces);

            if(row == 1)
                numberOfSpaces = 0;
            else
                numberOfSpaces -= 2;

            System.out.println();
        }
    }
}
