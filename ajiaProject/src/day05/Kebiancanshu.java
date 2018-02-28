package day05;

public class Kebiancanshu {

	public static void main(String[] args) {
		System.out.println(add(15, 16, 17, 18, 19));
	}

	public static int add(int... data) {
		int sum = 0;
		for (int a : data) {
			sum += a;
		}
		return sum;
	}
}
