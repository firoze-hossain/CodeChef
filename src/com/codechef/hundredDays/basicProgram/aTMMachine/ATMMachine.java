package com.codechef.hundredDays.basicProgram.aTMMachine;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String result="";
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] money=new int[n];
		    for(int i=0;i<n;i++){
		        money[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        if(money[i]<=k){
		            result+="1";
		            k=k-money[i];
		           
		        }else{
		            result+="0";
		        }
		    }
		    System.out.println(result);
		    
		}
    }
    
}
