package com.codechef.solveProblemUsingJava.makeAvg;

import java.util.Scanner;

public class MakeAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int c=sc.nextInt();
            int result=(a+c)/2;
            int b=(a+c)%2;
            if(b==0){
                System.out.println(result);
            }
            else{
                System.out.println(-1);
            }

        }
    }
}
