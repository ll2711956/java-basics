package com.ajia;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// Scanner scan=new Scanner(System.in);
		// System.out.println("������һ������:");
		// int a =scan.nextInt();
		// while(a<=1){
		// a=a-1;
		// System.out.println(a*a);
		// }
		//
		Scanner scan1 = new Scanner(System.in);
		System.out.println("���������:");
		int b = scan1.nextInt();
		if (b % 4 == 0 && b % 100 != 0) {
			System.out.println("������");
		} else if (b % 400 == 0) {
			System.out.println("������");
		} else {
			System.out.println("��ƽ��");
		}

	}

}
