package day03;

/*
 * 抽象类的总结
 * 1.抽象类不能被实例化,如果实例化需要被子类继承.
 *   通过向上转型去实现实例化
 * 2.抽象类中可以没有抽象方法,但是抽象方法必须在抽象类中.
 * 3.抽象类的抽象方法没有方法体,只定义了一个方法名称
 * 4.构造方法,有static修饰的地方不能出现abstract来修饰
 * 5.抽象类中的全部方法,通过子类全部覆写.
 */
public class Abstract02 {

	public static void main(String[] args) {
		// 向上转型
		Computer c = new Xiaoming();
		c.playGame();
		c.movie();
		// 向下转型
		Xiaoming x = (Xiaoming) c;
		x.xiutu();
	}

}

abstract class Computer {
	public abstract void playGame();

	public abstract void movie();

	public abstract void music();

	public abstract void writeCode();
}

class Xiaoming extends Computer {

	@Override
	public void playGame() {
		System.out.println("熊孩子就知道玩游戏");
	}

	@Override
	public void movie() {
		System.out.println("熊孩子就知道看动画片");
	}

	@Override
	public void music() {
		System.out.println("瓜娃子喜欢听音乐");
	}

	@Override
	public void writeCode() {
		System.out.println("瓜娃子在写代码");
	}

	public void xiutu() {
		System.out.println("熊孩子会用电脑修图了");
	}
}