package com.codechef.solveProblemUsingJava.solveSubCompAvg;

public class SolveSubCompAvg {
    public static void main(String[] args) {
        int a = 15;
        int c = 17;
        if (a % 2 == 0 && c % 2 == 0) {
            System.out.println("A and C Both are even");
        } else if (a % 2 != 0 && c % 2 != 0) {
            System.out.println("A and C Both are odd");
        } else {
            System.out.println("A is odd and C is even or vice versa");
        }

        a = 15;
        c = 18;
        if (a % 2 == 0 && c % 2 == 0) {
            System.out.println("A and C Both are even");
        } else if (a % 2 != 0 && c % 2 != 0) {
            System.out.println("A and C Both are odd");
        } else {
            System.out.println("A is odd and C is even or vice versa");
        }
    }
}
