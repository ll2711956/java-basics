package day03;

public class Zhuangxing03 {

	public static void main(String[] args) {
		//fun(new Person1());
		//fun(new Jack());
		fun(new Rose());
	}

	public static void fun(Person1 p) {
		p.eat();
		p.sleep();
		if (p instanceof Jack) {
			Jack j = (Jack) p;
			j.play();
		}
		if (p instanceof Rose) {
			Rose r = (Rose) p;
			r.makeup();
		}
	}

}

class Person1 {
	public void eat() {
		System.out.println("������,��������");
	}

	public void sleep() {
		System.out.println("�ص�˯��!");
	}
}

class Jack extends Person1 {
	public void play() {
		System.out.println("�ܺ��ӳ��˳Ծ�����");
	}
}

class Rose extends Person1 {
	public void makeup() {
		System.out.println("�ܺ��Ӱ����");
	}
}
