package day05;

public class Throws {

	public static void main(String[] args) {
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void f() throws Exception {
		fun();
	}

	public static void fun() throws Exception {
		System.out.println("JVM");
		System.out.println(10 / 0);
	}
}
