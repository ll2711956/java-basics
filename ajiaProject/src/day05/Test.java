package day05;

//ClassCastException�쳣
public class Test {

	public static void main(String[] args) {
		Person per = new Person("����", 18);//�쳣ԭ��:Ӧ������ת��������ת��
		Student s = (Student) per;
		s.fun();
	}

}

class Person {
	private String name;
	private int age;

	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public String toString() {
		return "����:" + name + ",����:" + age;
	}
}

class Student extends Person {
	private int num;

	public Student(String n, int a, int num) {
		super(n, a);
		this.num = num;
	}

	public void fun() {
		System.out.println("Hello world!");
	}
}