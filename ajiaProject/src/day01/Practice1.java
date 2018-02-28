package day01;

public class Practice1 {

	public static void main(String[] args) {
		double[] score = { 88.8, 56.4, 98, 60, 96.0, 56.2, 12.6, 77.7, 88.9, 66.5 };
		double sum = 0;
		double max = score[0];// 定义最大成绩
		double min = score[0];// 定义最小成绩
		int maxindex = 0;// 定义最大成绩的下标
		int minindex = 0;// 定义最小成绩的下标
		int c = 0;// 循环的初始条件
		while (c < score.length) {
			sum = sum + score[c];
			if (max < score[c]) {// 比最大成绩还大
				max = score[c];// 赋值给最大值
				maxindex = c;
			}
			if (min > score[c]) {// 比最小成绩还小
				min = score[c];// 赋值给最小值
				minindex = c;
			}
			c++;
		}
		System.out.println(sum);
		System.out.println(sum / score.length);
		System.out.println("最大值:" + max);
		System.out.println("最小值:" + min);
		System.out.println("最大值下标:" + maxindex);
		System.out.println("最小值下标:" + minindex);

	}

}
