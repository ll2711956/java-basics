package day05;

/*
 * �׳��쳣
 * try{
 *   ���ܳ����쳣�����
 * }catch{
 *   ������쳣���
 * }finally{
 *   ���ܲ�û�����쳣��Ҫִ�е����
 * }
 */
public class Yichang {

	public static void main(String[] args) {
		System.out.println("791689723");
		try {
			System.out.println(10 / 0); 
		} catch (ArithmeticException e) {
			e.printStackTrace();// �쳣�׳�
			// System.out.println(e);
		}
		System.out.println("154201113");
	}

}
