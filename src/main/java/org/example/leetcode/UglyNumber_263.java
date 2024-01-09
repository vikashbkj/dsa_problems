package org.example.leetcode;

// Failing at 8
public class UglyNumber_263 {

    public static void main(String[] args) {
//        int num = 6;
//        int num = 1;
//        int num = 14;
//        int num = 17;
        int num = 8;
        System.out.println(isUglyNumber(num));
    }

    private static boolean isUglyNumber(int num) {
        boolean isUgly = false;

        if (num < 0 || num == 0) { // As per question only positive number are required to be checked
            return false;
        }

        if (num == 1) {
            return true;
        }

        for (int i = 2; i < num; i++) {
            if ((i == 2 && num % i == 0) || (i == 3 && num % i == 0) || (i == 5 && num % i == 0)) {
                System.out.println("(1) i = " + i);
                isUgly = true;
                continue;
            }
            if (num % i == 0) {
                System.out.println("(2) i = " + i);
                isUgly = false;
                break;
            }
        }
        return isUgly;
    }
}
