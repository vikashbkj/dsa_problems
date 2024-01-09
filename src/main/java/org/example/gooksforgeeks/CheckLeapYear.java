package org.example.gooksforgeeks;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year = 16004;
//        int year = 1700;
//        int year = 1900;
//        int year = 2000;
//        int year = 2100;

        if (year % 4 == 0) {
            if (year % 100 == 0) { //Century Year
                if (year % 400 == 0) {
                    System.out.println("!! LEAP YEAR !!");
                } else {
                    System.out.println("NOT A LEAP YEAR !!");
                }
            } else {
                System.out.println("!! LEAP YEAR !!");
            }
        } else {
            System.out.println("NOT A LEAP YEAR !!");
        }
    }
}
