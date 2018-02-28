package day01;

public class Arrtest1 {

	public static void main(String[] args) {
		// 求最小值和最大值
		int[] a = { 10, 20, 36, 19, 10 };
		int min = a[0];
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			min = a[i] > min ? min : a[i];
			max = a[i] > max ? a[i] : max;
		}
		System.out.println("最小值:"+min);
		System.out.println("最大值:"+max);
	}

}
