package day05;

//ClassCastException异常
public class Test {

	public static void main(String[] args) {
		Person per = new Person("张三", 18);//异常原因:应先向上转型再向下转型
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
		return "姓名:" + name + ",年龄:" + age;
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