package com.codechef.hundredDays.basicProgram.vOWELOrCONSONANT;

import java.util.Scanner;

public class VOWELOrCONSONANT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

}
