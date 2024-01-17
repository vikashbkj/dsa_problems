package org.example.learyard.patterns;


/**

N = 5
    *
   **
  ***
 ****
*****

 */

//https://read.learnyard.com/triangle-pattern/
public class Mirrored_Right_Triangle_Pattern {

    public static void main(String[] args) {
        int N = 5;
        printMirrorRightTriangle(N);
    }

    private static void printMirrorRightTriangle(int N) {
        for (int row = 1; row <= N; row++) {
            for (int spaces = 1; spaces <= N - row; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
