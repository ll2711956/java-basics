package day02;

class A {
	// private>缺省>public
	void print() {
		System.out.println("***********06");
	}
}

class B extends A {
	public void print() {
		System.out.println("&&&&&&&&&&&&&&&08");
	}
}

public class Fuxie {

	/*
	 * 方法的覆写 既不想改变父类中的方法名称,又想扩充父类的功能. 返回类型不变,方法名称不变,参数类型不变,参数个数不变,方法功能改变.
	 * 子类要覆写父类的方法,子类的修饰权限不能高于父类
	 */
	public static void main(String[] args) {
		B b = new B();
		b.print();
	}
}
