package com.codechef.solveProblemUsingJava.string.ordValuesString;

import java.util.Scanner;

public class OrdValuesString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            for(int i=0;i<s.length();i++){
                int a=s.charAt(i);
                System.out.print(a+" ");
            }
            System.out.println();

        }
    }
}
