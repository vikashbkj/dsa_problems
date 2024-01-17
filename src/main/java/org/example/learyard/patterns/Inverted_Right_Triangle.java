package org.example.learyard.patterns;


/**

N = 5
*****
****
***
**
*

 */

//https://read.learnyard.com/triangle-pattern/
public class Inverted_Right_Triangle {
    public static void main(String[] args) {
        int N = 10;
        printInvertedRightTriangle(N);
    }

    private static void printInvertedRightTriangle(int N) {
        for (int row = 0; row < N; row++) {
            for (int column = 1; column <= N - row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
