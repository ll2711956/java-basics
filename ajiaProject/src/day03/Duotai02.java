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
		System.out.println("在吃饭.....");
	}
}

class Student extends Person {
	public void study() {
		System.out.println("瓜娃子在学习...");
	}

	public void eat() {
		System.out.println("瓜娃子在吃饭....");
	}
}

class Teacher extends Person {
	public void teach() {
		System.out.println("老师在教瓜娃子...");
	}

	public void eat() {
		System.out.println("老师在吃饭....");
	}
}

class Worker extends Person {
	public void work() {
		System.out.println("工人在搬砖...");
	}

	public void eat() {
		System.out.println("工人在吃麻辣烫....");
	}
}
