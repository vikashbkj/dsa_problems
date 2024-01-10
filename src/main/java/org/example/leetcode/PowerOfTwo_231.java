package org.example.leetcode;

//231. Power of Two
//Given an integer n, return true if it is a power of two. Otherwise, return false.
import java.util.Scanner;

public class PowerOfTwo_231 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

//        int num = 1;
//        int num = 16;
//        int num = 3;
//        int num = 0;

//        int num = -4;
//        int num = -16;
//        int num = -13;
        int num = -12;

        boolean isPowerOf2 = false;

        if(num == 0)
            return;
        if(num == 1) {
            isPowerOf2 = true;
            System.out.println(isPowerOf2);
            return;
        }
        while (num % 2 == 0) {
            num = num / 2;
            if (num == 1 || num == -1) {
                isPowerOf2 = true;
                break;
            }
        }
        System.out.println(isPowerOf2);
    }
}
