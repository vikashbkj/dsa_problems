package org.example.hackerearth;


import java.math.BigInteger;

//https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/does-it-divide-3c60b8fb/
public class DoesItDivide {

    public static void main(String[] args) {
        int N = 40;
        System.out.println(desItDivide(N));
    }

    static String desItDivide(int N) {
        BigInteger P = new BigInteger("1");

        for (long k = N; k >= 1; --k) {
            P = new BigInteger(""+P).multiply(new BigInteger(""+k));

        }

        BigInteger S = (new BigInteger(""+N).multiply(new BigInteger(""+(N+1)))).divide(new BigInteger(""+2));
        //System.out.println("P = " + P + " S = " + S);

        BigInteger result = P.mod(S);
        if(result.intValue() == 0)
            return "YES";
        else
            return "NO";
    }
}
