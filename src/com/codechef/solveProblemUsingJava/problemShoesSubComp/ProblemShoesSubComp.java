package com.codechef.solveProblemUsingJava.problemShoesSubComp;

public class ProblemShoesSubComp {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        if (n <= m) {
            System.out.println("We need to buy " + n + " shoes");
        } else {
            System.out.println("We need to buy " + (2 * n - m) + " shoes");
        }
        n = 15;
        m = 10;
        if (n <= m) {
            System.out.println("We need to buy " + n + " shoes");
        } else {
            System.out.println("We need to buy " + (2 * n - m) + " shoes");
        }
    }
}
