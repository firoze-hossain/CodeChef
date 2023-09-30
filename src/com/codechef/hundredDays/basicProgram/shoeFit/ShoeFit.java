package com.codechef.hundredDays.basicProgram.shoeFit;

import java.util.Scanner;

public class ShoeFit {
    public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(a==0 && b==1 || a==1 && b==0 || b==0 && c==1 || b==1 && c==0 || a==0 && c==1 || a==1 && c==0){
		        System.out.println(1);
		    }else{
		        System.out.println(0);
		    }
		} 
    }
    
}
