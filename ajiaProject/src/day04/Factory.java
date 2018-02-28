package day04;

public class Factory {
	public static void main(String[] args) {
		/* 静态方法调用:直接用类名称.方法名称
		 * Fruit06 f = Factory01.getInstance(args[0])
		 * -->等价于Fruit06 f =newApple();
		 * -->Factory01.getInstance(args[0]);
		 */
		Fruit06 f = Factory01.getInstance(args[0]);
		if (f!=null) {
			f.eat();
		}
		
	}
}

class Factory01 {
	// 返回类型是Fruit06
	// Fruit06 f = new Apple();
	public static Fruit06 getInstance(String a) {
		if ("Apple".equals(a)) {
			return new Apple();
		} else if ("Banana".equals(a)) {
			return new Banana();
		} else if ("Orange".equals(a)) {
			return new Orange();
		} else {
			return null;
		}

	}
}

interface Fruit06 {
	void eat();
}

class Apple implements Fruit06 {

	@Override
	public void eat() {
		System.out.println("吃苹果...");
	}

}

class Banana implements Fruit06 {

	@Override
	public void eat() {
		System.out.println("吃香蕉...");
	}

}

class Orange implements Fruit06 {

	@Override
	public void eat() {
		System.out.println("吃橘子...");
	}

}