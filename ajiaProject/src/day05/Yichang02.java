package day05;

//�׳�����쳣 Exception�������쳣�İְ�
public class Yichang02 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a / b);
			// } catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			// } catch (ArithmeticException e) {
			// e.printStackTrace();
			// } catch (NumberFormatException e) {
			// e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("LLLLLLLLLLL");
		}
	}

}
