package com.codechef.hundredDays.basicProgram.chefAndStocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChefAndStocks {
    public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    ArrayList<Integer>profit=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        profit.add(sc.nextInt());
		    }
		    Collections.sort(profit);
		    int result=0;
		    for(int i=1;i<profit.size();i++){
		        result+=profit.get(i);
		    }
		    System.out.println(result);
		    
		}
    }
    
}
