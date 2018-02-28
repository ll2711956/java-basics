package day01;

public class ArrDemo {

	public static void main(String[] args) {
		/*
		 * 定义二维数组 数据类型 数组名称[][]=new 数据类型[行长度][列长度]; 静态初始化 数据类型 数组名称[][]=new
		 * 数据类型[][]{(值,值,值,...),(值,值,值,...)(值,值,值,...)};
		 */

		int arr[][] = new int[][] { { 18, 12, 13 }, { 12, 12, 14 }, { 11, 13, 11 }, { 11, 12 } };
		// for循环的嵌套:外层走一遍,内层走全部
		for (int i = 0; i < arr.length; i++) { // 循环二维数组(控制的行)
			for (int j = 0; j < arr[i].length; j++) {// 循环二位数组中的小数组(控制的列)
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
		for (int i = 1; i <= 9; i++){// 计算第一次落地到第九次落地再弹起小球经过多少米
			height = height / 2;
			sum = sum + height * 2;
		} // 循环结束，小球第十次落地
		System.out.println("第十次落地时的高度是：" + height + "\n小球共经过：" + sum + "米");

	}

}
