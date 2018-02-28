package day05;
// 单例设计模式  饿汉式
public class Danli {
    //2.构造方法私有化后不能直接实例化
	public static void main(String[] args) {
          Singleton  s = Singleton.get();
          s.info();
	}

}
//1.定义一个类
class Singleton{
	//3.在类中实例化定义一个属性
	//4.在属性前面加static
	//5.封装性后所有属性都要进行实例化
	//8.为防止属性被修改,将属性改为常量
	private final static Singleton SIN=new Singleton();
	private Singleton (){
		
	}
	public void info(){
		System.out.println("晚上没睡好,很困");
	}
	//6.写一个方法来实例化
	//7.在方法前加static
	public static Singleton get(){
		return SIN;
	}
}