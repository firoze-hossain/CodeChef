package com.codechef.solveProblemUsingJava.problemMarioGen;

public class ProblemMarioGen {
    public static void main(String[] args) {
        int x = 12;
        if (x % 3 == 0) {
            System.out.println("Mario's size after eating " + x + " mushrooms is NORMAL");
        }
        x = 13;
        if (x % 3 == 1) {
            System.out.println("Mario's size after eating " + x + " mushrooms is HUGE");
        }
        x = 14;
        if (x % 3 == 2) {
            System.out.println("Mario's size after eating " + x + " mushrooms is SMALL");
        }
    }
}
