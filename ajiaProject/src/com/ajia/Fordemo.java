package com.ajia;

public class Fordemo {

	public static void main(String[] args) {
		// ��ӡ1-10
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		// ��ӡ10-1
		for (int a = 10; a >= 1; a--) {
			System.out.println(a);
		}
		// ��ӡ2,4,6,8,10
		for (int b = 2; b <= 10; b += 2) {
			System.out.println(b);
		}
		for (int i = 2; i <= 10; i += 2) {
			if (i >= 2) {
				System.out.println(i);
			}
		}
		// ��ӡ9,99,999,9999,...99999
		// �ⷨһ
		for (int c = 10; c < 1000000000; c *= 10) {
			System.out.println(c - 1);
		}
		// �ⷨ��
		for (int i = 9; i < 999999999; i = i * 10 + 9) {
			System.out.println(i);
		}
		// �˷��ھ��ڶ���
		int i = 2;
		for (int j = 2; j <= 9; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}
		// ����1+2+3+...+100
		int sum = 0;
		for (int j = 1; j <= 100; j++) {
			sum = sum + j;
		}
		System.out.println(sum);
		// ���5�Ľ׳�
		int sum1 = 1;
		for (int i1 = 2; i1 <= 5; i1++) {
			sum1 = sum1 * i1;
		}
		System.out.println(sum1);
		// ����2+22+222+...+222222222
		long sum2 = 0;
		for (long j = 2; j <= 222222222; j = j * 10 + 2) {
			sum2 = sum2 + j;
		}
		System.out.println(sum2);
		// ����1/1+1/3+1/5+1/7+1/9+1/11...+1/20
		double sum3 = 0.0;
		for (double j = 1; j <= 20; j += 2) {
			sum3 = sum3 + 1 / j;
		}
		System.out.println(sum3);
		// ����1+1/2!+1/3!+1/4!+....+1/20!
		double sum4 = 0.0;
		double a2 = 1;
		for (int j = 1; j <= 20; j++) {
			a2 *= j;// ��ĸ�Ľ׳�
			sum4 += 1 / a2;
		}
		System.out.println(sum4);

	}

}
