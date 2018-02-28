package com.ajia;

public class TestDemo2 {

	public static void main(String[] args) {
		Person2 per2 = new Person2("小黄人", 6);
		System.out.println(per2.info());
	}

}

class Person2 {
	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(791689723);
	}

	public String info() {
		this.print();
		return "姓名:" + name + " 年龄:" + age;

	}
}