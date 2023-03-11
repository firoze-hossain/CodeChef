package com.codechef.solveProblemUsingJava.bathProblemSubComp;

public class BathProblemSubComp {
    public static void main(String[] args) {
        int x = 15;
        int y = 1;
        int buckets_filled = x % y;
        if ( buckets_filled != 1) {
            buckets_filled = x / y;
            int people = buckets_filled / 2;
            System.out.println(people);
        }
        x = 15;
        y = 3;

        buckets_filled = x % y;
        if (buckets_filled != 1) {
            buckets_filled = x / y;
            int people = buckets_filled / 2;
            System.out.println(people);
        }
    }
}
