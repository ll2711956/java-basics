package day01;

public class Practice1 {

	public static void main(String[] args) {
		double[] score = { 88.8, 56.4, 98, 60, 96.0, 56.2, 12.6, 77.7, 88.9, 66.5 };
		double sum = 0;
		double max = score[0];// �������ɼ�
		double min = score[0];// ������С�ɼ�
		int maxindex = 0;// �������ɼ����±�
		int minindex = 0;// ������С�ɼ����±�
		int c = 0;// ѭ���ĳ�ʼ����
		while (c < score.length) {
			sum = sum + score[c];
			if (max < score[c]) {// �����ɼ�����
				max = score[c];// ��ֵ�����ֵ
				maxindex = c;
			}
			if (min > score[c]) {// ����С�ɼ���С
				min = score[c];// ��ֵ����Сֵ
				minindex = c;
			}
			c++;
		}
		System.out.println(sum);
		System.out.println(sum / score.length);
		System.out.println("���ֵ:" + max);
		System.out.println("��Сֵ:" + min);
		System.out.println("���ֵ�±�:" + maxindex);
		System.out.println("��Сֵ�±�:" + minindex);

	}

}
