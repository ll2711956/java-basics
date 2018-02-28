package day05;

//单例设计模式  懒汉式
public class Danli01 {
	// 2.构造方法私有化后不能直接实例化
	public static void main(String[] args) {
		Singleton01 s = Singleton01.get();
		s.info();
	}

}

// 1.定义一个类
class Singleton01 {
	// 3.在类中实例化定义一个属性
	// 4.在属性前面加static
	// 5.封装性后所有属性都要进行实例化
	// 8.为防止属性被修改,将属性改为常量
	private  static Singleton01 SIN = null;

	private Singleton01() {

	}

	public void info() {
		System.out.println("晚上没睡好,很困");
	}

	// 6.写一个方法来实例化
	// 7.在方法前加static
	public static Singleton01 get() {
		if (SIN == null) {
			SIN = new Singleton01();
		}
		return SIN;
	}
}