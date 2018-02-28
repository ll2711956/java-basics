package day04;

public class Factory04 {

	public static void main(String[] args) {
		Shoes s = Factory05.getInstance(args[0]);
		if (s != null) {
			s.brand();
		}
	}
}

class Factory05 {
	public static Shoes getInstance(String aa) {
		if ("Nike".equals(aa)) {
			return new Nike();
		} else if ("Adidas".equals(aa)) {
			return new Adidas();
		} else if ("Vans".equals(aa)) {
			return new Vans();
		} else {
			return null;
		}

	}
}

interface Shoes {
	void brand();
}

class Nike implements Shoes {
	@Override
	public void brand() {
		System.out.println("air force �ܾ���");
	}
}

class Vans implements Shoes {
	@Override
	public void brand() {
		System.out.println("Vans������");
	}
}

class Adidas implements Shoes {
	@Override
	public void brand() {
		System.out.println("Adidas��boostЬ����");
	}
}