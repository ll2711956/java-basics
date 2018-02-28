package day05;

/*
 * 抛出异常
 * try{
 *   可能出现异常的语句
 * }catch{
 *   处理的异常语句
 * }finally{
 *   不管产没产生异常都要执行的语句
 * }
 */
public class Yichang {

	public static void main(String[] args) {
		System.out.println("791689723");
		try {
			System.out.println(10 / 0); 
		} catch (ArithmeticException e) {
			e.printStackTrace();// 异常抛出
			// System.out.println(e);
		}
		System.out.println("154201113");
	}

}
