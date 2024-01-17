package org.example.learyard.patterns;


/**

 N = 5
     *
    ***
   *****
  *******
 *********

 N = 10
          *
         ***
        *****
       *******
      *********
     ***********
    *************
   ***************
  *****************
 *******************

 */

//https://read.learnyard.com/pyramid-star-pate/
public class Pyramid_Pattern {

    public static void main(String[] args) {
        int N = 10;
        printPyramid(N);
    }

    static void printPyramid(int N) {
        int numberOfStars = 1;

        for (int row = 1; row <= N; ++row) {
            for (int column = N - row; column >= 1; column--) {
                System.out.print(" ");
            }
            for (int column = numberOfStars; column >= 1; column--) {
                System.out.print("*");
            }
            System.out.println();
            numberOfStars += 2;
        }
    }
}
