package day01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrTest {

	public static void main(String[] args) {
		int[] a = create(7);
		// Arrays.toString(数组名称) 输出数组内容
		System.out.println(Arrays.toString(a));
		print(a);
		max(a);
		min(a);
		sum(a);
		avg(a);
	}

	public static int[] create(int x) {
		int[] arr = new int[x];
		Random ran = new Random();// 产生随机数
		// 含下不含上[0,100) 0-99中任意一个整数
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100);
		}
		return arr;
	}

	// 写出一个输出数组的方法
	public static void print(int[] k) {
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}
		System.out.println("输出结束");
	}

	public static int max(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			max = a[i] > max ? a[i] : max;
		}
		System.out.println("最大值:" + max);
		return max;
	}

	public static int min(int[] b) {
		int min = b[0];
		for (int i = 0; i < b.length; i++) {
			min = b[i] > min ? min : b[i];
		}
		System.out.println("最小值:" + min);
		return min;
	}

	public static int sum(int[] c) {
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum = sum + c[i];
		}
		System.out.println("数组元素之和为:" + sum);
		return sum;
	}

	public static int avg(int[] d) {
		int avg = sum(d) / d.length;
		System.out.println("数组元素平均值为:" + avg);
		return avg;
	}

}
