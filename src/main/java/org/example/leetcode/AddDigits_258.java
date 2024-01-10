package org.example.leetcode;



//https://leetcode.com/problems/add-digits/description/
public class AddDigits_258 {

    public static void main(String[] args) {
        Solution_258 s = new Solution_258();
        /**
         * Test Cases
         * 38
         * 0
         * 1
         * 98
         * 165
         * 101
         */
//        int sumDigits = s.addDigits(38);
//        int sumDigits = s.addDigits(0);
//        int sumDigits = s.addDigits(98);
//        int sumDigits = s.addDigits(165);

        int sumDigits = s.addDigits(101);
        System.out.println(sumDigits);
    }
}

