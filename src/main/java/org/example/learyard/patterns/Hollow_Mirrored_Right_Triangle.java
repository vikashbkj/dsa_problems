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
public class Hollow_Mirrored_Right_Triangle {

    public static void main(String[] args) {
        int N = 10;
        printHollowMirrorRightTriangle(N);
    }

    private static void printHollowMirrorRightTriangle(int N) {
        int num_stars = 1;
        int num_spaces = 0;

        for (int row = 1; row <= N; row++) {
            for (int spaces = 1; spaces <= N - row; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= num_stars; stars++) {
                System.out.print("*");
                if (row != N) {
                    for (int k = 1; k <= num_spaces; k++) {
                        System.out.print(" ");
                    }
                }
            }

            if (row == N -1) {
                num_stars = N;
            } else {
                num_stars = 2;
            }
            if (row != 1)
                num_spaces++;

            System.out.println();
        }
    }
}
