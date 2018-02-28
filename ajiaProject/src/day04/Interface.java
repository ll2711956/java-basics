package day04;

/*
 * �ӿ���һ�ֹ���ͱ�׼
 * �ӿڵĶ���:interface �ӿ�����{}
 * �ӿڵ�Ӧ��(ʵ��):class �������� implements �ӿ�����{}
 */
public class Interface {

	public static void main(String[] args) {
		// ʵ�����ӿڲ�����ת��
		USB usb = new Lenovo();
		usb.start();
		usb.end();
		// ����ת��,ʵ���������з���
		Lenovo l = (Lenovo) usb;
		l.touchID();
		// ʵ�����ӿڲ�����ת��
		USB usb1 = new HP();
		usb1.start();
		usb1.end();
		// ����ת��,ʵ���������з���
		HP hp = (HP) usb1;
		hp.playGame();
	}

}

interface USB {
	// �ӿ���ֻ���г����ͳ��󷽷�

	// ���峣��,�������븳ֵ���Ҳ����Ըı�
	public static final String COLOR = "blue";

	// ������󷽷�
	public abstract void start();

	public abstract void end();
}

class Lenovo implements USB {

	@Override
	public void start() {
		System.out.println("Lenovo��USB�Ѳ���");
	}

	@Override
	public void end() {
		System.out.println("Lenovo��USB�Ѱγ�");
	}

	public void touchID() {
		System.out.println("Lenovo��ThinkPad��ָ��ʶ��");
	}
}

class HP implements USB {

	@Override
	public void start() {
		System.out.println("HP��USB�Ѳ���");
	}

	@Override
	public void end() {
		System.out.println("HP��USB�Ѱγ�");
	}

	public void playGame() {
		System.out.println("HP����ɢ�Ȳ���");
	}
}
