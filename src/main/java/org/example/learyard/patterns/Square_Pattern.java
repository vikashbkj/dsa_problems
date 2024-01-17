package org.example.learyard.patterns;


/**
N = 4
 ****
 ****
 ****
 ****

N = 5
 *****
 *****
 *****
 *****
 *****

 */

//https://read.learnyard.com/square-star-and-rhombus-start-patterns/
public class Square_Pattern {
    public static void main(String[] args) {
        int N = 5;
        printSquarePattern(N);
    }

    static void printSquarePattern(int N) {
        for (int row = 1; row <= N; row++) {
            for (int column = 1; column <= N; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
