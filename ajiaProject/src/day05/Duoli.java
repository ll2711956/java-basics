package day05;

//�������ģʽ
public class Duoli {

	public static void main(String[] args) {
		Sex ss = Sex.get(Sex.SECRETS);
		System.out.println(ss);
	}

}

class Sex {
	public final static int NANS = 1;//���峣��1��ʾ��
	public final static int NVS = 2;//���峣��2��ʾŮ
	public final static int SECRETS = 3;//���峣��3��ʾ����
    //ʵ��������
	private final static Sex NAN = new Sex("��");
	private final static Sex NV = new Sex("Ů");
	private final static Sex SECRET = new Sex("����");

	private String title;//��������

	private Sex(String title) {//���췽��˽�л�
		this.title = title;//��ʵ������ʱ����и�ֵ
	}
    //��дObject��toString����
	public String toString() {
		return this.title;//����title
	}
    //ͨ���ⲿ����ʵ����
	public static Sex get(int a) {
		switch (a) {
		case 1:
			return NAN;
		case 2:
			return NV;
		case 3:
			return SECRET;
		default:
			return null;
		}

	}

}
