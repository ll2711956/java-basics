package day01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrTest {

	public static void main(String[] args) {
		int[] a = create(7);
		// Arrays.toString(��������) �����������
		System.out.println(Arrays.toString(a));
		print(a);
		max(a);
		min(a);
		sum(a);
		avg(a);
	}

	public static int[] create(int x) {
		int[] arr = new int[x];
		Random ran = new Random();// ���������
		// ���²�����[0,100) 0-99������һ������
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100);
		}
		return arr;
	}

	// д��һ���������ķ���
	public static void print(int[] k) {
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}
		System.out.println("�������");
	}

	public static int max(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			max = a[i] > max ? a[i] : max;
		}
		System.out.println("���ֵ:" + max);
		return max;
	}

	public static int min(int[] b) {
		int min = b[0];
		for (int i = 0; i < b.length; i++) {
			min = b[i] > min ? min : b[i];
		}
		System.out.println("��Сֵ:" + min);
		return min;
	}

	public static int sum(int[] c) {
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum = sum + c[i];
		}
		System.out.println("����Ԫ��֮��Ϊ:" + sum);
		return sum;
	}

	public static int avg(int[] d) {
		int avg = sum(d) / d.length;
		System.out.println("����Ԫ��ƽ��ֵΪ:" + avg);
		return avg;
	}

}
