package day05;

/*
 * throws��throw������
 * throw:�ڷ�������ʹ��,��ʾ����һ���ֹ��׳��쳣
 * throws:�ڷ����Ķ�����ʹ��,��ʾ�ڵ��ø÷�����ʱ��Ҫ�����쳣����
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
