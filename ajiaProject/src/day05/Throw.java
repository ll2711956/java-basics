package day05;

/*
 * throws和throw的区别
 * throw:在方法体中使用,表示的是一个手工抛出异常
 * throws:在方法的定义中使用,表示在调用该方法的时候要进行异常处理
 */
public class Throw {

	public static void main(String[] args) {
		try {
			throw new Exception("Hello!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
