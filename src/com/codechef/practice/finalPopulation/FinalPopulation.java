package com.codechef.practice.finalPopulation;

import java.util.Scanner;

public class FinalPopulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(x - y + z);
        }
    }

}
