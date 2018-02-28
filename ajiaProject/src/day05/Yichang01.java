package day05;

/* 抛出异常
* try{
*   可能出现异常的语句
* }catch{
*   处理的异常语句
* }finally{
*   不管产没产生异常都要执行的语句
* }
*/
public class Yichang01 {

	public static void main(String[] args) {
		try {
			int a[] = new int[3];
			a[0] = 10;
			a[1] = 12;
			a[2] = 13;
			a[3] = 14;
			for (int i : a) {
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("抛出程序异常后仍要输出的语句");
		}
	}

}
