package day01;

public class Practice {

	public static void main(String[] args) {
		char[] arr = { 'A', 'B', 'C' };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		char[] arr2 = { 'r', 'g', 'b' };
		int i = 0;
		while (i < arr2.length) {
			System.out.println(arr2[i]);
			i++;
		}

		// for����ѭ�����
		char[] arr3 = { 'A', 'B', 'C' };
		for (int i1 = arr3.length - 1; i1 >= 0; i1--) {
			System.out.println(arr3[i1]);
		}

		// while����ѭ�����
		char[] arr4 = { 'r', 'g', 'b' };
		int a = arr4.length - 1;
		while (a >= 0) {
			System.out.println(arr4[a]);
			a--;
		}

		//����洢ѧ���ɼ�������
		double[] score = { 88.8, 56.4, 98, 60, 96.0, 56.2, 12.6, 77.7, 88.9, 66.5 };
		double sum = 0;//�������ܳɼ�
		double max = score[0];//�������ɼ�
		double min = score[0];//������С�ɼ�
		int maxindex = 0;//�������ɼ����±�
		int minindex = 0;//������С�ɼ����±�
		for (int j = 0; j < score.length; j++) {
			sum = sum + score[j];
			if (max < score[j]) {//�����ɼ�����
				max = score[j];//��ֵ�����ֵ
				maxindex = j;
			}
			if (min > score[j]) {//����С�ɼ���С
				min = score[j];//��ֵ����Сֵ
				minindex = j;
			}
		}
		System.out.println("�ܷ�:" + sum);
		System.out.println("ƽ����:" + sum / score.length);
		// ��������е����ֵ
		System.out.println("��߷�:" + max);
		System.out.println("��ͷ�" + min);
		System.out.println("��߷ֵ��±�:" + maxindex);
		System.out.println("��ͷֵ��±�:" + minindex);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
