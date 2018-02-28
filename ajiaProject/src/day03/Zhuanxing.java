package day03;

public class Zhuanxing {

	public static void main(String[] args) {
		// 向上转型,自动完成
		// 父类 父类对象=子类实例
		AA aa = new BB();
		aa.print();
		// 向下转型,需要强制转换
		// 子类 子类对象=(子类)父类对象
		// 向下转型的前提必须要进行向上转型
		BB bb = (BB) aa;
		bb.printBB();
	}

}

class AA {
	public void print() {
		System.out.println("@...............@");
	}
}

class BB extends AA {
	public void print() {
		System.out.println("&.............&");
	}

	public void printBB() {
		System.out.println("*............*");
	}
}
