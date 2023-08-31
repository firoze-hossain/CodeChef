package com.codechef.hundredDays.basicProgram.decrementORIncrement;

import java.util.Scanner;

public class DecrementORIncrement {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0){
            System.out.println(n+1);
        }else{
            System.out.println(n-1);
        }

    }
}
