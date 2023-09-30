package com.codechef.hundredDays.basicProgram.penaltyShots;

import java.util.Scanner;

public class PenaltyShots {
    public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int count1=0;
		    int count2=0;
		    for(int i=1;i<=10;i++){
		        int a=sc.nextInt();
		        if(i%2!=0){
		            count1+=a;
		        }else{
		             count2+=a;
		        }
		        
		    }
		    if(count1>count2){
		        System.out.println(1);
		    }else if(count1<count2){
		        System.out.println(2);
		    }else{
		        System.out.println(0);
		    }
		}
    }
    
}
