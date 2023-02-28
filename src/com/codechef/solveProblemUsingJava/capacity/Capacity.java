package com.codechef.solveProblemUsingJava.capacity;

import java.util.Scanner;

public class Capacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int five_seat_capacity = n * 5;
            int seven_seat_capacity = m * 7;
            System.out.println(five_seat_capacity + seven_seat_capacity);
        }
    }
}
