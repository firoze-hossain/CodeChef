package com.codechef.solveProblemUsingJava.inputMirror;

import java.util.Scanner;

public class InputMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        System.out.print(N + " ");
        System.out.print(S);
    }
}
