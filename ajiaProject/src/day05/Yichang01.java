package day05;

/* �׳��쳣
* try{
*   ���ܳ����쳣�����
* }catch{
*   ������쳣���
* }finally{
*   ���ܲ�û�����쳣��Ҫִ�е����
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
			System.out.println("�׳������쳣����Ҫ��������");
		}
	}

}
