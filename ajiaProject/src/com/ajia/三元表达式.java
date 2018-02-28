package com.ajia;

import java.util.Scanner;

public class 三元表达式 {

	public static void main(String[] args) {
         // int a =1>0?10:20;
//          Scanner scan=new Scanner(System.in);
//          int x1=scan.nextInt();
//          int x2=scan.nextInt();
//          int x3=scan.nextInt();
//          int max=x1>x2?x1:x2;
//          max=max>x3?max:x3;
//          System.out.println(max);
		
		double a=900.9;
		if( a<500){
			System.out.println("总价:"+a);
		}else if(a<800){
			System.out.println("总价:"+a*0.9);
		}else if(a<1000){
			System.out.println("总价:"+a*0.85);
		}else if(a<2000){
			System.out.println("总价:"+a*0.8);
		}else if(a>=2000){
			System.out.println("总价:"+a*0.7);
		}
		
		
		
		
		
	}
	
	
	

}
