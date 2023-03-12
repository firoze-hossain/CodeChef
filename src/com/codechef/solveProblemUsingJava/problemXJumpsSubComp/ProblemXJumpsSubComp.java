package com.codechef.solveProblemUsingJava.problemXJumpsSubComp;

public class ProblemXJumpsSubComp {
    public static void main(String[] args) {
        int x = 19;
        int y = 3;
        if (x % y == 0) {
            System.out.println("Count of move is " + (x / y));
        } else {
            System.out.println("Count of move is " + ((x / y) + (x % y)));
        }
        x = 20;
        y = 3;
        if (x % y == 0) {
            System.out.println("Count of move is " + (x / y));
        } else {
            System.out.println("Count of move is " + ((x / y) + (x % y)));
        }
    }
}
