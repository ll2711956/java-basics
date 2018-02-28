package day02;

public class Static01 {
	// 定义一个静态属性来存储值
	static int count;

	// 每实例化就调用一次构造方法
	public Static01() {
		System.out.println("实例化的次数: " + count++);
	}
}
