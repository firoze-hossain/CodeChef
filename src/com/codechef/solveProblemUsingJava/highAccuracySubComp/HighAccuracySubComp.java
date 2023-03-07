package com.codechef.solveProblemUsingJava.highAccuracySubComp;

public class HighAccuracySubComp {
    public static void main(String[] args) {
        int x = 30;
        if (x % 3 == 0) {
            System.out.println("Number of questions incorrctly solved is 0");
        } else if ((x + 1) % 3 == 0) {
            System.out.println("Number of questions incorrctly solved is 1");
        } else {
            System.out.print("Number of questions incorrctly solved is 2");
        }

        x = 34;
        if (x % 3 == 0) {
            System.out.println("Number of questions incorrctly solved is 0");
        } else if ((x + 1) % 3 == 0) {
            System.out.println("Number of questions incorrctly solved is 1");
        } else {
            System.out.print("Number of questions incorrctly solved is 2");
        }
    }
}
