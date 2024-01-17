package org.example.learyard.patterns;



/**

 *
 **
 ***
 ****
 *****

 */

//https://read.learnyard.com/triangle-pattern/
public class Right_Triangle_Pattern {

    public static void main(String[] args) {
        int N = 5;
        printRightTriangle(N);
    }

    static void printRightTriangle(int N) {
        for (int row = 1; row <= N; ++row) {
            for (int column = 1; column <= row; ++column) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
