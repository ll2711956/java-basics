package day01;

public class WhileFor1 {

	/*
	 * do{}while() ����ѭ���ĳ�ʼ���� do{ ִ��ѭ������� �ı�ѭ�������� }while(����ѭ��������);
	 */
	public static void main(String[] args) {
		int a = 1;// ����ѭ���ĳ�ʼ����
		int sum = 0;// ����1+2+...+100��ֵ
		do {
			sum += a;
			a++;// �ı�ѭ��������
		} while (a <= 100);
		System.out.println(sum);

		int sum1 = 0;
		int b = 300;
		do {
			sum1 += b;
			b += 2;
		} while (b <= 400);
		System.out.println(sum1);

		// *
		// **
		// ***
		// ****
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int i = 0;
		while (i < 4) {
			for (int j1 = 0; j1 <= i; j1++) {
				System.out.print("*");
			}
			i++;
			System.out.println();
		}

		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		for (int i1 = 1; i1 <= 5; i1++) {
			for (int j = 4; j >= i1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//     *
		//    * *
		//   * * *
		//  * * * *
		int line = 5;// ����Ҫ��������ǵ�����
		for (int j = 0; j < line; j++) {// ������������
			for (int j2 = j; j2 < line; j2++) {// ������ ���ƿո�����
				System.out.print(" ");
			}
			for (int j3 = 0; j3 < j; j3++) {// �������ǵ����
				System.out.print(" *");// �������
			}
			System.out.println();
		}

	}

}
