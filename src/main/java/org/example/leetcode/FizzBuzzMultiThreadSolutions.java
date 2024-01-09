package org.example.leetcode;


//1195. Fizz Buzz Multithreaded LeetCode

public class FizzBuzzMultiThreadSolutions {

    public static void main(String[] args) {
        int num = 15;
        FizzBuzz fb = new FizzBuzz(num);

        try {
            for (int i = 1; i <= num; i++) {
                if (i % 5 == 0 && i % 3 == 0)
                    fb.fizzbuzz(() -> System.out.print("FizzBuzz "));
                else if (i % 3 == 0)
                    fb.fizz(() -> System.out.print("Fizz "));
                else if (i % 5 == 0)
                    fb.buzz(() -> System.out.print("Buzz "));
                else {
                    int finalI = i;
                    fb.number((Integer) -> System.out.print(finalI + " "));
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}