package day01;

public class ArrDemo {

	public static void main(String[] args) {
		/*
		 * �����ά���� �������� ��������[][]=new ��������[�г���][�г���]; ��̬��ʼ�� �������� ��������[][]=new
		 * ��������[][]{(ֵ,ֵ,ֵ,...),(ֵ,ֵ,ֵ,...)(ֵ,ֵ,ֵ,...)};
		 */

		int arr[][] = new int[][] { { 18, 12, 13 }, { 12, 12, 14 }, { 11, 13, 11 }, { 11, 12 } };
		// forѭ����Ƕ��:�����һ��,�ڲ���ȫ��
		for (int i = 0; i < arr.length; i++) { // ѭ����ά����(���Ƶ���)
			for (int j = 0; j < arr[i].length; j++) {// ѭ����λ�����е�С����(���Ƶ���)
				System.out.println(arr[i][j]);
			}
		}

		int sum1 = 0;
		int flag = 0;
		for (int i = 1; i >= 1; i++) {
			sum1 += i;
			if (sum1 == 3003) {
				flag = i;
				break;
			}
		}
		System.out.println(flag);
		
		double sum = 100, height = 100;
		for (int i = 1; i <= 9; i++){// �����һ����ص��ھŴ�����ٵ���С�򾭹�������
			height = height / 2;
			sum = sum + height * 2;
		} // ѭ��������С���ʮ�����
		System.out.println("��ʮ�����ʱ�ĸ߶��ǣ�" + height + "\nС�򹲾�����" + sum + "��");

	}

}
