package day05;

public class Throws01 {

	public static void main(String[] args) {
		try {
			System.out.println(div(16, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int div(int a, int b) throws Exception{
		int result = 0;
		System.out.println("���㿪ʼ");
		try {
			result = a / b; //�쳣���,��ĸΪ0
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("�������");
		}
		return result;
	}
}
