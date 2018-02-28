package day05;

//�������ģʽ  ����ʽ
public class Danli01 {
	// 2.���췽��˽�л�����ֱ��ʵ����
	public static void main(String[] args) {
		Singleton01 s = Singleton01.get();
		s.info();
	}

}

// 1.����һ����
class Singleton01 {
	// 3.������ʵ��������һ������
	// 4.������ǰ���static
	// 5.��װ�Ժ��������Զ�Ҫ����ʵ����
	// 8.Ϊ��ֹ���Ա��޸�,�����Ը�Ϊ����
	private  static Singleton01 SIN = null;

	private Singleton01() {

	}

	public void info() {
		System.out.println("����û˯��,����");
	}

	// 6.дһ��������ʵ����
	// 7.�ڷ���ǰ��static
	public static Singleton01 get() {
		if (SIN == null) {
			SIN = new Singleton01();
		}
		return SIN;
	}
}