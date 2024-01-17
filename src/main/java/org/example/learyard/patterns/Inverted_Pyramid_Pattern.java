package org.example.learyard.patterns;


/**

 N = 5
 *********
  *******
   *****
    ***
     *

 N = 10
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *

 */

//https://read.learnyard.com/pyramid-star-pate/
public class Inverted_Pyramid_Pattern {

    public static void main(String[] args) {
        int N = 10;
        printInvertedPyramid(N);
    }

    static void printInvertedPyramid(int N) {
        for (int row = N; row >= 1; row--) {

            for (int i = 1; i <= N -row; i++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * row) -1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
