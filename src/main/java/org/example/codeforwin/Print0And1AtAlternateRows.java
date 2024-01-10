package org.example.codeforwin;

//https://codeforwin.org/c-programming/c-program-to-print-number-pattern-with-0-1-at-alternate-rows
public class Print0And1AtAlternateRows {

    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j= 1; j <= columns; j++) {
                if (i % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
