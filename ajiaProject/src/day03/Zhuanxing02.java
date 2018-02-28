package day03;

//输出子类中继承父类的语句
public class Zhuanxing02 {

	public static void main(String[] args) {
		fun(new AA1());
		fun(new BB1());
		fun(new CC());
	}

	public static void fun(AA1 a) {
		a.print();// 调用父类的方法
		if (a instanceof BB1) {// 判断实例化是否是BB1
			// 子类 子类对象=(父类)父类的实例化;
			BB1 b = (BB1) a;// 向下转型
			b.printBB1();// 调用子类特有的方法
		}

		if (a instanceof CC) {
			CC c = (CC) a;
			c.printCC();
		}
	}
}

class AA1 {
	public void print() {
		System.out.println("---------A");
	}
}

class BB1 extends AA1 {
	public void printBB1() {
		System.out.println("-------------BB");
	}
}

class CC extends AA1 {
	public void printCC() {
		System.out.println("----------------CC");
	}
}