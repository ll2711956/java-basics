package day03;

public class Zhuanxing {

	public static void main(String[] args) {
		// ����ת��,�Զ����
		// ���� �������=����ʵ��
		AA aa = new BB();
		aa.print();
		// ����ת��,��Ҫǿ��ת��
		// ���� �������=(����)�������
		// ����ת�͵�ǰ�����Ҫ��������ת��
		BB bb = (BB) aa;
		bb.printBB();
	}

}

class AA {
	public void print() {
		System.out.println("@...............@");
	}
}

class BB extends AA {
	public void print() {
		System.out.println("&.............&");
	}

	public void printBB() {
		System.out.println("*............*");
	}
}
