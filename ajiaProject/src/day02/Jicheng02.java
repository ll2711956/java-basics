package day02;

public class Jicheng02 {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("杨戬");
		t.setAge(48000);
		t.setNum(20180223);
		t.setTeacherNum(791689723);
		t.setTitle("叫兽");
		System.out.println(t.info());
	}

	/*
	 * 继承的限制
	 * 一个子类只能继承一个父类,一个父类可以有多个子类
	 * 子类不能继承父类的私有属性和方法
	 * 实例化对象的时候先实例化父类
	 */
}
