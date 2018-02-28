package day04;

/*
 * 总结
 * 接口定义及接口的使用
 * interface 接口名{}
 * 接口的使用1
 * class 子类 implements 接口名{}
 * 接口的使用2
 * class 子类 implements 接口1,接口2,...{}
 * 接口的使用3
 * class 子类 extends 类(抽象类) implements 接口名{}
 * 
 * 接口的使用规则
 * 1.接口表示的是一种能力
 * 2.接口表示的是一种标准
 * 3.表示服务端的远程视图方法传递给客户端
 * 
 * 接口总结
 * 1.避免了单继承,一个子类可以实现多个接口
 * 2.接口的实现定义一个子类,通过implements来实现接口
 * 3.接口中的方法全部是抽象方法,全局常量的定义可以不加static
 * 4.接口要实现必须要子类,通过向上转型来实现接口实例化
 * 
 * 工厂设计模式 案例
 * 
 * Object 类
 * 为什么要使用Object类
 * Object是所有类的父类
 */
public class Object02 {

	public static void main(String[] args) {
           AC ac=new BC();
           Object obj=ac;
           BC bc=(BC)obj;
           bc.printBC();
	}

}

interface AC {
	void print();
}

class BC implements AC {

	@Override
	public void print() {
        System.out.println("***********88");
	}
	
	public void printBC(){
		System.out.println("-------------->99");
	}
}