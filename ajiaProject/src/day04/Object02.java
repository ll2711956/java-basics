package day04;

/*
 * �ܽ�
 * �ӿڶ��弰�ӿڵ�ʹ��
 * interface �ӿ���{}
 * �ӿڵ�ʹ��1
 * class ���� implements �ӿ���{}
 * �ӿڵ�ʹ��2
 * class ���� implements �ӿ�1,�ӿ�2,...{}
 * �ӿڵ�ʹ��3
 * class ���� extends ��(������) implements �ӿ���{}
 * 
 * �ӿڵ�ʹ�ù���
 * 1.�ӿڱ�ʾ����һ������
 * 2.�ӿڱ�ʾ����һ�ֱ�׼
 * 3.��ʾ����˵�Զ����ͼ�������ݸ��ͻ���
 * 
 * �ӿ��ܽ�
 * 1.�����˵��̳�,һ���������ʵ�ֶ���ӿ�
 * 2.�ӿڵ�ʵ�ֶ���һ������,ͨ��implements��ʵ�ֽӿ�
 * 3.�ӿ��еķ���ȫ���ǳ��󷽷�,ȫ�ֳ����Ķ�����Բ���static
 * 4.�ӿ�Ҫʵ�ֱ���Ҫ����,ͨ������ת����ʵ�ֽӿ�ʵ����
 * 
 * �������ģʽ ����
 * 
 * Object ��
 * ΪʲôҪʹ��Object��
 * Object��������ĸ���
 */
public class Object02 {

	public static void main(String[] args) {
           AC ac=new BC();
           Object obj=ac;
           BC bc=(BC)obj;
           bc.printBC();
	}

}

interface AC {
	void print();
}

class BC implements AC {

	@Override
	public void print() {
        System.out.println("***********88");
	}
	
	public void printBC(){
		System.out.println("-------------->99");
	}
}