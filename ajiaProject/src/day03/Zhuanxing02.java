package day03;

//��������м̳и�������
public class Zhuanxing02 {

	public static void main(String[] args) {
		fun(new AA1());
		fun(new BB1());
		fun(new CC());
	}

	public static void fun(AA1 a) {
		a.print();// ���ø���ķ���
		if (a instanceof BB1) {// �ж�ʵ�����Ƿ���BB1
			// ���� �������=(����)�����ʵ����;
			BB1 b = (BB1) a;// ����ת��
			b.printBB1();// �����������еķ���
		}

		if (a instanceof CC) {
			CC c = (CC) a;
			c.printCC();
		}
	}
}

class AA1 {
	public void print() {
		System.out.println("---------A");
	}
}

class BB1 extends AA1 {
	public void printBB1() {
		System.out.println("-------------BB");
	}
}

class CC extends AA1 {
	public void printCC() {
		System.out.println("----------------CC");
	}
}