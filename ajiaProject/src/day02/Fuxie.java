package day02;

class A {
	// private>ȱʡ>public
	void print() {
		System.out.println("***********06");
	}
}

class B extends A {
	public void print() {
		System.out.println("&&&&&&&&&&&&&&&08");
	}
}

public class Fuxie {

	/*
	 * �����ĸ�д �Ȳ���ı丸���еķ�������,�������丸��Ĺ���. �������Ͳ���,�������Ʋ���,�������Ͳ���,������������,�������ܸı�.
	 * ����Ҫ��д����ķ���,���������Ȩ�޲��ܸ��ڸ���
	 */
	public static void main(String[] args) {
		B b = new B();
		b.print();
	}
}
