package day04;

//Object����������İְ�(����)
public class Object01 {
	                        // ������args����
	public static void main(String[] args) {
		// ����ת��
		Object ob = new Person("����", 18);
		// ����ת��
		Person per = (Person) ob;
		System.out.println(per.info());
		// ����ת��
		Object obj = args;  //-->Object obj = new String();
		// ����ת��
		Object objs = new BB();
		
		Person per1=new Person("����",19);
		System.out.println(per1.toString());
	}

}

interface AA {

}

class BB implements AA {

}

class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String info() {
		return "����:" + name + ",����" + age;
	}
	
	//��дObject����toString�ķ���
	public String toString(){
		return "����:" + name + ",����" + age;
	}
}