package day05;
// �������ģʽ  ����ʽ
public class Danli {
    //2.���췽��˽�л�����ֱ��ʵ����
	public static void main(String[] args) {
          Singleton  s = Singleton.get();
          s.info();
	}

}
//1.����һ����
class Singleton{
	//3.������ʵ��������һ������
	//4.������ǰ���static
	//5.��װ�Ժ��������Զ�Ҫ����ʵ����
	//8.Ϊ��ֹ���Ա��޸�,�����Ը�Ϊ����
	private final static Singleton SIN=new Singleton();
	private Singleton (){
		
	}
	public void info(){
		System.out.println("����û˯��,����");
	}
	//6.дһ��������ʵ����
	//7.�ڷ���ǰ��static
	public static Singleton get(){
		return SIN;
	}
}