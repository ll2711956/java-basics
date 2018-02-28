package day03;

public class Duotai02 {

	public static void main(String[] args) {
		fun(new Student());
		fun(new Teacher());
		fun(new Worker());
	}

	public static void fun(Person p) {
		p.eat();
		if (p instanceof Student) {
			Student stu = (Student) p;
			stu.study();
		}
		if (p instanceof Teacher) {
			Teacher t = (Teacher) p;
			t.teach();
		}
		if (p instanceof Worker) {
			Worker w = (Worker) p;
			w.work();
		}
	}

	/*
	 * public static void fun(Student s) { s.eat(); s.study(); }
	 * 
	 * public static void fun(Teacher t) { t.eat(); t.teach(); }
	 * 
	 * public static void fun(Worker w) { w.eat(); w.work(); }
	 */
}

class Person {
	public void eat() {
		System.out.println("�ڳԷ�.....");
	}
}

class Student extends Person {
	public void study() {
		System.out.println("��������ѧϰ...");
	}

	public void eat() {
		System.out.println("�������ڳԷ�....");
	}
}

class Teacher extends Person {
	public void teach() {
		System.out.println("��ʦ�ڽ̹�����...");
	}

	public void eat() {
		System.out.println("��ʦ�ڳԷ�....");
	}
}

class Worker extends Person {
	public void work() {
		System.out.println("�����ڰ�ש...");
	}

	public void eat() {
		System.out.println("�����ڳ�������....");
	}
}
