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

		// for倒着循环输出
		char[] arr3 = { 'A', 'B', 'C' };
		for (int i1 = arr3.length - 1; i1 >= 0; i1--) {
			System.out.println(arr3[i1]);
		}

		// while倒着循环输出
		char[] arr4 = { 'r', 'g', 'b' };
		int a = arr4.length - 1;
		while (a >= 0) {
			System.out.println(arr4[a]);
			a--;
		}

		//定义存储学生成绩的数组
		double[] score = { 88.8, 56.4, 98, 60, 96.0, 56.2, 12.6, 77.7, 88.9, 66.5 };
		double sum = 0;//定义求总成绩
		double max = score[0];//定义最大成绩
		double min = score[0];//定义最小成绩
		int maxindex = 0;//定义最大成绩的下标
		int minindex = 0;//定义最小成绩的下标
		for (int j = 0; j < score.length; j++) {
			sum = sum + score[j];
			if (max < score[j]) {//比最大成绩还大
				max = score[j];//赋值给最大值
				maxindex = j;
			}
			if (min > score[j]) {//比最小成绩还小
				min = score[j];//赋值给最小值
				minindex = j;
			}
		}
		System.out.println("总分:" + sum);
		System.out.println("平均分:" + sum / score.length);
		// 求出数组中的最大值
		System.out.println("最高分:" + max);
		System.out.println("最低分" + min);
		System.out.println("最高分的下标:" + maxindex);
		System.out.println("最低分的下标:" + minindex);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
