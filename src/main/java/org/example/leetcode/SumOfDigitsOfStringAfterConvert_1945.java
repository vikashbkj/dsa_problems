package org.example.leetcode;


import java.math.BigInteger;




//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/
public class SumOfDigitsOfStringAfterConvert_1945 {

    public static void main(String[] args) {

//        long lValue = 61252532021211101918L; //Error  that is why converting long to BigInteger

//        int sumOfDigits = getLucky("zbax", 2);
//        int sumOfDigits = getLucky("iiii", 1);
//        long sumOfDigits = getLucky("leetcode", 2); // error with int type that is why converting int to long
        long sumOfDigits = getLucky("fleyctuuajsr", 5);

        System.out.println(sumOfDigits);
    }

    public static int getLucky(String s, int k) {

        BigInteger convertedValue = convertStringToIntegerByPositionOfLetters(s);
        BigInteger sumOfDigits = convertedValue;
        for (int i = 1; i <= k; i++) {
            sumOfDigits = sumOfDigits(sumOfDigits);
        }
        return sumOfDigits.intValue();
    }

    private static BigInteger sumOfDigits(BigInteger num) {
        BigInteger sum = new BigInteger("0");
        BigInteger lastDigit = new BigInteger("0");

        while (!num.equals(BigInteger.ZERO)) {
            lastDigit = num.mod(BigInteger.TEN);
            sum = sum.add(lastDigit);
            num = num.divide(BigInteger.TEN);
        }
        return sum;
    }
    private static BigInteger convertStringToIntegerByPositionOfLetters(String s) {
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArr.length; i++) {
            int value = charArr[i] - 96;
            sb.append(value);
        }
        return new BigInteger(sb.toString());
    }
}
