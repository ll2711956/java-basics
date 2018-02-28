package com.ajia;

public class TestDemo3 {

	public static void main(String[] args) {
		Person4 per4 = new Person4("Leo", 25);
		System.out.println(per4.info());
	}

}

class Person4 {
	private String name;
	private int age;

	public Person4() {
		System.out.println("好饿啊,想吃热干面");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person4(String name) {
		this();
		this.name = name;
	}

	public Person4(int age) {
		this();
		this.age = age;
	}

	public Person4(String name, int age) {
		this(name);
		this.age = age;
	}

	public String info() {
		return "姓名:" + name + " 年龄:" + age;
	}
}
