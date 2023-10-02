package com.codechef.hundredDays.basicProgram.nearestExit;

import java.util.Scanner;

public class NearestExit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    if(x>=1 && x<=50){
		        System.out.println("Left");
		    }else{
		        System.out.println("Right");
		    }
		}
    }

}
