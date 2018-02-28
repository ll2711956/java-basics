package day01;

import java.util.Scanner;

public class WhileFor {

	public static void main(String[] args) {
		copyArr();
		yunsuan();
	}

	public static void copyArr() {
		int[] arr = { 12, 123, 123, 45, 645, 6456, 4, 56, 456, 45 };
		int[] copyarr = new int[arr.length];
		int i = 0;
		while (i < arr.length) {
			copyarr[i] = arr[i];
			i++;
		}

		for (int j = copyarr.length - 1; j >= 0; j--) {
			System.out.println(copyarr[j]);
		}

	}

	public static void yunsuan() {
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		if ((a % 3 == 0 && a % 5 == 0) || a % 2 == 0) {
			System.out.println(a);
		}
	}

}
