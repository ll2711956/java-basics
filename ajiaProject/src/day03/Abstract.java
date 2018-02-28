package day03;

/*
 * 抽象类的定义
 * abstract class 类名称{}
 * 抽象方法的定义
 * public abstract 返回类型 方法名称(参数类型  参数); 
 * abstract关键字
 * 定义在类的前面    定义在方法返回值前面(没有方法体"{}")
 * 定义抽象类的意义
 * 1.为子类提供一个公共的类型
 * 2.封装子类中重复的内容(属性个方法)
 * 3.定义抽象方法,在子类中有不同的实现,但方法名称是一致的.
 * 抽象类需要子类去实现,抽象需要继承
 */
public class Abstract {

	public static void main(String[] args) {
		// 向上转型
		Demo d = new Demo1();
		d.print();
		d.play();
		// 向下转型
		Demo1 d1 = (Demo1) d;
		d1.bro();
	}

}

// 定义一个抽象类
abstract class Demo {
	public int num; // 定义一个属性
	public final static double PI = 3.1415926;// 定义一个常量用final修饰,常量名称全部大写

	public void shuchu() {

	}

	public Demo() {

	}

	// 定义一个抽象方法,抽象方法没有方法体
	public abstract void print();

	public abstract void play();
}

class Demo1 extends Demo {
	// 子类继承了抽象类,必须要覆写父类的全部抽象方法
	@Override   //@全称annotation:注解
	public void print() {
		System.out.println("追风筝的人");
	}

	@Override
	public void play() {
		System.out.println("哈桑和阿米尔");
	}

	// 子类特有的方法
	public void bro() {
		System.out.println("哈桑和阿米尔是同父异母的兄弟");
	}
}
