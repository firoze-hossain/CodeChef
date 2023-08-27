package com.codechef.hundredDays.basicProgram.puzzleHunt;

import java.util.Scanner;

public class PuzzleHunt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 6 && n <= 8) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
