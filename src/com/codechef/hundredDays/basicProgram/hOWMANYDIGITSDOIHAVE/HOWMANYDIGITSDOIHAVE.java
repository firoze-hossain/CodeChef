package com.codechef.hundredDays.basicProgram.hOWMANYDIGITSDOIHAVE;

import java.util.Scanner;

public class HOWMANYDIGITSDOIHAVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        if (str.length() <= 3) {
            System.out.println(str.length());
        } else {
            System.out.println("More than 3 digits");
        }
    }
}
