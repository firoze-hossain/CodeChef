package com.codechef.solveProblemUsingJava.flipCardsSubComp;

public class FlipCardsSubComp {
    public static void main(String[] args) {
        int n = 10;
        int x = 4;
        int op1 = x;
        int op2 = n - x;
        System.out.println(Math.min(op1, op2));
        n = 10;
        x = 6;
        op1 = x;
        op2 = n - x;
        System.out.println(Math.min(op1, op2));
    }
}
