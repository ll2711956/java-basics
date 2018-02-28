package day03;

/*
 * ������Ķ���
 * abstract class ������{}
 * ���󷽷��Ķ���
 * public abstract �������� ��������(��������  ����); 
 * abstract�ؼ���
 * ���������ǰ��    �����ڷ�������ֵǰ��(û�з�����"{}")
 * ��������������
 * 1.Ϊ�����ṩһ������������
 * 2.��װ�������ظ�������(���Ը�����)
 * 3.������󷽷�,���������в�ͬ��ʵ��,������������һ�µ�.
 * ��������Ҫ����ȥʵ��,������Ҫ�̳�
 */
public class Abstract {

	public static void main(String[] args) {
		// ����ת��
		Demo d = new Demo1();
		d.print();
		d.play();
		// ����ת��
		Demo1 d1 = (Demo1) d;
		d1.bro();
	}

}

// ����һ��������
abstract class Demo {
	public int num; // ����һ������
	public final static double PI = 3.1415926;// ����һ��������final����,��������ȫ����д

	public void shuchu() {

	}

	public Demo() {

	}

	// ����һ�����󷽷�,���󷽷�û�з�����
	public abstract void print();

	public abstract void play();
}

class Demo1 extends Demo {
	// ����̳��˳�����,����Ҫ��д�����ȫ�����󷽷�
	@Override   //@ȫ��annotation:ע��
	public void print() {
		System.out.println("׷���ݵ���");
	}

	@Override
	public void play() {
		System.out.println("��ɣ�Ͱ��׶�");
	}

	// �������еķ���
	public void bro() {
		System.out.println("��ɣ�Ͱ��׶���ͬ����ĸ���ֵ�");
	}
}
