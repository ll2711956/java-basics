package day03;
/*
 * ��̬�Զ���:һ����Ϊ���в�ͬ�ı�������
 * ����������
 * 1.����
 * (1).����������
 * (2).�����ĸ�д
 * 2.��
 * ���������ת��:���� �������=����ʵ��
 * ���������ת��,��Ҫǿ��ת��:���� �������=(����)�������
 */
class A {
	public void print() {
		System.out.println("Hello,world!");
	}

	public void print(int a) {
		System.out.println("���,��Ƥ!");
	}

	public void print(double b) {
		System.out.println("�ټ�,��Ƥ!");
	}
}

class B extends A{
	public void print(){
		System.out.println("�Ի�����");
	}
}
public class Duotai {

	public static void main(String[] args) {
	/*	A a = new A();
		a.print();
		a.print(6);
		a.print(6.6);*/
		
		B b =new B();
		b.print();
		b.print(8.8);
		b.print(10);
	}

}
