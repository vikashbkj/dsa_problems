package org.example.learyard.patterns;


/**

N = 5
 *****
  *****
   *****
    *****
     *****

 */

//https://read.learnyard.com/square-star-and-rhombus-start-patterns/
public class Mirrored_Rhombus_Pattern {

    public static void main(String[] args) {
        int N = 5;
        printMirrorRhombus(N);
    }

    private static void printMirrorRhombus(int N) {

        for (int row = 1; row <= N; row++) {
            for (int spaces = 1; spaces <= row - 1; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= N; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
