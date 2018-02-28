package com.ajia;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// Scanner scan=new Scanner(System.in);
		// System.out.println("请输入一个整数:");
		// int a =scan.nextInt();
		// while(a<=1){
		// a=a-1;
		// System.out.println(a*a);
		// }
		//
		Scanner scan1 = new Scanner(System.in);
		System.out.println("请输入年份:");
		int b = scan1.nextInt();
		if (b % 4 == 0 && b % 100 != 0) {
			System.out.println("是闰年");
		} else if (b % 400 == 0) {
			System.out.println("是闰年");
		} else {
			System.out.println("是平年");
		}

	}

}
