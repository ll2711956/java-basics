package day04;

public class Factory03 {

	public static void main(String[] args) {
		Vegetable01 v = Factory02.getInstance(args[0]);
		if (v != null) {
			v.chaoCai();
		}

	}

}

interface Vegetable01 {
	void chaoCai();
}

class Factory02 {
	public static Vegetable01 getInstance(String a) {
		if ("Fanqie01".equals(a)) {
			return new Fanqie01();
		} else if ("Qiezi".equals(a)) {
			return new Qiezi();
		} else if ("Baicai".equals(a)) {
			return new Baicai();
		} else {
			return null;
		}

	}
}

class Fanqie01 implements Vegetable01 {

	@Override
	public void chaoCai() {
		System.out.println("·¬ÇÑ³´¼¦µ°");
	}

}

class Qiezi implements Vegetable01 {

	@Override
	public void chaoCai() {
		System.out.println("ÓãÏãÇÑ×Ó");
	}

}

class Baicai implements Vegetable01 {

	@Override
	public void chaoCai() {
		System.out.println("Çå³´°×²Ë");
	}

}