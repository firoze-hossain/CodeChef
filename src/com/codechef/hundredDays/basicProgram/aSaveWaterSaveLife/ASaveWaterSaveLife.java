package com.codechef.hundredDays.basicProgram.aSaveWaterSaveLife;

import java.util.Scanner;

public class ASaveWaterSaveLife{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int h=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int c=sc.nextInt();
		    int totalConsumSingleHousehold=x+(y/2);
		    int totalConsumAllHousehold=totalConsumSingleHousehold*h;
		    if(totalConsumAllHousehold<=c){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		}
        
    }
}