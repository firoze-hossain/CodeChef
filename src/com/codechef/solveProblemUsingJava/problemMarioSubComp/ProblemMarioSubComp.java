package com.codechef.solveProblemUsingJava.problemMarioSubComp;

public class ProblemMarioSubComp {
    public static void main(String[] args) {
        int x = 12;
        if (x % 3 == 0) {
            System.out.println("NORMAL");
        } else if ((x - 1) % 3 == 0) {
            System.out.println("HUGE");
        } else {
            System.out.println("SMALL");
        }
        x = 13;
        if (x % 3 == 0) {
            System.out.println("NORMAL");
        } else if ((x - 1) % 3 == 0) {
            System.out.println("HUGE");
        } else {
            System.out.println("SMALL");
        }

    }
}
