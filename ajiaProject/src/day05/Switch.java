package day05;
/*
 * switch(参数){
 * case 参数1:
 *     执行语句;
 *     break;
 * case 参数2:
 *     执行语句;
 *     break;
 * case 参数3:
 *     执行语句;
 *     break;
 * default:
 *     执行语句;
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
			System.out.println("今天天气很好");
			break;
		case 2:
			System.out.println("昨天天气也不错");
			break;
		case 3:
			System.out.println("明天可能会下雨");
			break;
		default:
			System.out.println("这个星期天气都很好");
			break;
		}
	}
}
