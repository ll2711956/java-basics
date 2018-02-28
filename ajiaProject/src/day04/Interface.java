package day04;

/*
 * 接口是一种规则和标准
 * 接口的定义:interface 接口名称{}
 * 接口的应用(实现):class 子类名称 implements 接口名称{}
 */
public class Interface {

	public static void main(String[] args) {
		// 实例化接口并向上转型
		USB usb = new Lenovo();
		usb.start();
		usb.end();
		// 向下转型,实现子类特有方法
		Lenovo l = (Lenovo) usb;
		l.touchID();
		// 实例化接口并向上转型
		USB usb1 = new HP();
		usb1.start();
		usb1.end();
		// 向下转型,实现子类特有方法
		HP hp = (HP) usb1;
		hp.playGame();
	}

}

interface USB {
	// 接口中只能有常量和抽象方法

	// 定义常量,常量必须赋值并且不可以改变
	public static final String COLOR = "blue";

	// 定义抽象方法
	public abstract void start();

	public abstract void end();
}

class Lenovo implements USB {

	@Override
	public void start() {
		System.out.println("Lenovo的USB已插入");
	}

	@Override
	public void end() {
		System.out.println("Lenovo的USB已拔出");
	}

	public void touchID() {
		System.out.println("Lenovo的ThinkPad有指纹识别");
	}
}

class HP implements USB {

	@Override
	public void start() {
		System.out.println("HP的USB已插入");
	}

	@Override
	public void end() {
		System.out.println("HP的USB已拔出");
	}

	public void playGame() {
		System.out.println("HP电脑散热不行");
	}
}
