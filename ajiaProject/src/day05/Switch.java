package day05;
/*
 * switch(����){
 * case ����1:
 *     ִ�����;
 *     break;
 * case ����2:
 *     ִ�����;
 *     break;
 * case ����3:
 *     ִ�����;
 *     break;
 * default:
 *     ִ�����;
 *     break;
 * }
 */
public class Switch {

	public static void main(String[] args) {
		fun(6);
	}

	public static void fun(int a) {
		switch (a) {
		case 1:
			System.out.println("���������ܺ�");
			break;
		case 2:
			System.out.println("��������Ҳ����");
			break;
		case 3:
			System.out.println("������ܻ�����");
			break;
		default:
			System.out.println("��������������ܺ�");
			break;
		}
	}
}
