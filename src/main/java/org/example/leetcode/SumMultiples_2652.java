package org.example.leetcode;

public class SumMultiples_2652 {

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(sumOfMultiples(n));
    }

    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++) {
            if(x % 3 == 0 || x % 5 == 0 || x % 7 == 0) {
                sum += x;
            }
        }
        return sum;
    }
}
