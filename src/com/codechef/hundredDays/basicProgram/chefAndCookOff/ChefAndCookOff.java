package com.codechef.hundredDays.basicProgram.chefAndCookOff;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndCookOff{
    public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			while(n-->0){
		ArrayList<Integer>list=new ArrayList<>();
	for(int i=0;i<5;i++){
	    list.add(sc.nextInt());
	}
	int count=0;
	for(int i=0;i<list.size();i++){
	    if(list.get(i)==1){
	        count+=1;
	    }
	}
	if(count==0){
	    System.out.println("Beginner");
	}else if(count==1){
	    System.out.println("Junior Developer");
	}else if(count==2){
	    System.out.println("Middle Developer");
	}else if(count==3){
	    System.out.println("Senior Developer");
	}else if(count==4){
	    System.out.println("Hacker");
	}else{
	    System.out.println("Jeff Dean");
	}
			}
    }
}