package com.codechef.hundredDays.basicProgram.marathon;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int day=sc.nextInt();
		    int distance=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(day*distance>=10 && day*distance<21){
		        System.out.println(a);
		    }else if(day*distance>=20 && day*distance<42){
		        System.out.println(b);
		    }else if(day*distance>=42){
		        System.out.println(c);
		    }else{
		        System.out.println(0);
		    }
		}
    }
}
