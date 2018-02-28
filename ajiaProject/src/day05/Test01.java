package day05;

public class Test01 {
	// java.lang.RuntimeException
	public static void main(String[] args) {
		/* try{ */
		int num = Integer.parseInt(args[0]); // 参数String类型转换为int类型
		System.out.println(num * num); // NumberFormatException
		/*
		 * }catch(Exception e){ e.printStackTrace(); }
		 */
		/**
		 * RuntimeException和Exception 1、RuntimeException 是Exception 子类。
		 * 2、只要是RuntimeException的子类,不要强制性的进行异常的处理, 如果出现了异常,它会把异常交给java虚拟机处理。
		 * 3、看看常见的RuntimeException的子类， ArithmeticException(算术异常)
		 * ClassCastException(类转型异常)、 IndexOutOfBoundsException(数组越界异常)
		 * NullPointerException(空指针异常)
		 */
	}

}
