package day03;
/*
 * 多态性定义:一个行为具有不同的表现能力
 * 体现在哪里
 * 1.方法
 * (1).方法的重载
 * (2).方法的覆写
 * 2.类
 * 对象的向上转型:父类 父类对象=子类实例
 * 对象的向下转型,需要强制转换:子类 子类对象=(子类)父类对象
 */
class A {
	public void print() {
		System.out.println("Hello,world!");
	}

	public void print(int a) {
		System.out.println("你好,瓜皮!");
	}

	public void print(double b) {
		System.out.println("再见,瓜皮!");
	}
}

class B extends A{
	public void print(){
		System.out.println("猎户星座");
	}
}
public class Duotai {

	public static void main(String[] args) {
	/*	A a = new A();
		a.print();
		a.print(6);
		a.print(6.6);*/
		
		B b =new B();
		b.print();
		b.print(8.8);
		b.print(10);
	}

}
