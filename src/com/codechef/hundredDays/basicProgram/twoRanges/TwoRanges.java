package com.codechef.hundredDays.basicProgram.twoRanges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoRanges {
    public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int count=0;
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    
		    Set<Integer> set=new HashSet<>();
		    for(int i=a;i<=b;i++){
		        set.add(i);
		    }
		      for(int i=c;i<=d;i++){
		        set.add(i);
		    }
		    System.out.println(set.size());
		    
		}
	}
    }
    

