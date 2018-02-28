package day04;

public class Factory10 {

	public static void main(String[] args) {
		Jewelry jr = Factory11.getInstance(args[0]);
		if (jr != null) {
			jr.goods();
		}
	}

}

interface Jewelry {
	void goods();
}

class Factory11 {
	public static Jewelry getInstance(String a) {
		if ("Cartier".equals(a)) {
			return new Cartier();
		} else if ("Bvlgari".equals(a)) {
			return new Bvlgari();
		} else if ("Piaget".equals(a)) {
			return new Piaget();
		} else {
			return null;
		}
	}
}

class Cartier implements Jewelry {
	@Override
	public void goods() {
		System.out.println("卡地亚love系列");
	}
}

class Bvlgari implements Jewelry {
	@Override
	public void goods() {
		System.out.println("宝格丽陶瓷戒指");
	}
}

class Piaget implements Jewelry {
	@Override
	public void goods() {
		System.out.println("伯爵可转动戒指");
	}
}
