package day03;

/*
 * ��������ܽ�
 * 1.�����಻�ܱ�ʵ����,���ʵ������Ҫ������̳�.
 *   ͨ������ת��ȥʵ��ʵ����
 * 2.�������п���û�г��󷽷�,���ǳ��󷽷������ڳ�������.
 * 3.������ĳ��󷽷�û�з�����,ֻ������һ����������
 * 4.���췽��,��static���εĵط����ܳ���abstract������
 * 5.�������е�ȫ������,ͨ������ȫ����д.
 */
public class Abstract02 {

	public static void main(String[] args) {
		// ����ת��
		Computer c = new Xiaoming();
		c.playGame();
		c.movie();
		// ����ת��
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
		System.out.println("�ܺ��Ӿ�֪������Ϸ");
	}

	@Override
	public void movie() {
		System.out.println("�ܺ��Ӿ�֪��������Ƭ");
	}

	@Override
	public void music() {
		System.out.println("������ϲ��������");
	}

	@Override
	public void writeCode() {
		System.out.println("��������д����");
	}

	public void xiutu() {
		System.out.println("�ܺ��ӻ��õ�����ͼ��");
	}
}