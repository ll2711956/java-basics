package day02;

class DD{
	// ͨ��final���εĳ���,�����������е���ĸ��Ҫ��д
	final double PI=3.1415926;
	public void modifier(){
		System.out.println("�ⲻ��һ��final���εķ���");
	}
}

class FF extends DD{
	public final void modifier(){
		System.out.println("����һ��final���εķ���");
	}
}

public class Final {
	/*
	 * final ����,�����޸ĵ� 
	 * final ���ε����ǲ���ʵ�ּ̳е� 
	 * final ���ε�������һ������,�����޸� 
	 * final ���εķ�������ʵ�ָ�д
	 */
	public static void main(String[] args) {

	}

}
