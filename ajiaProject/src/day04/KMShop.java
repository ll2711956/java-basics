package day04;

/*
 * �ܽ�
 *  1���ӿڱ����˵��̳У�һ���������ʵ�ֶ���ӿڡ�
 *  2���ӿڵ�ʵ��һ������һ�����࣬ͨ��implements ��ʵ�ֽӿڡ�
 *  3���ӿ��з���ȫ���ǳ��󷽷���ȫ�ֳ����Ķ�����Բ���static��
 *  4���ӿ�Ҫʵ�ֱ���Ҫ���࣬ͨ������ת����ʵ�ֽӿ�ʵ������
 *  
 *  �����нӿڵ�ʹ��ԭ��
 *  1����ʾ����һ�ֲ�����׼�͹���
 *  2����ʾ����һ������
 *  3�����������˵�Զ�̷����ṩ�ͻ���
 */
public class KMShop extends KFCAbstract implements KFC {

	@Override
	public void shutiao() {
		System.out.println("KFC�����ֵ���������ɫ��" + COLOR);
	}

	@Override
	public void hanbao() {
		System.out.println("KFC�����ֵ꺺����nice");
	}

	@Override
	public void kele() {
		System.out.println("KFC�����ֵ���ֲ��ú�");
	}

	@Override
	public void zhaShutiao() {
		System.out.println("�����ֵ��ը�����ܲ���");
	}

	@Override
	public void zuoHanbao() {
		System.out.println("�����ֵ�������е�С");
	}

	public static void main(String[] args) {
		KMShop kms = new KMShop();
		kms.shutiao();
		kms.hanbao();
		kms.kele();
		kms.zhaShutiao();
		kms.zuoHanbao();
	}
}
