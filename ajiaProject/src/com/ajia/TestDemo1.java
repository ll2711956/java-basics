package com.ajia;

public class TestDemo1 {
	/*
	 * this �ؼ���ָ����ǰ��
	 */
	public static void main(String[] args) {
		Person per = new Person("����", 28);
		System.out.println(per.info());
	}
}

class Person {
	private String name;
	private int age;
	/*
	 * ���췽��������ʼ������ public ������(){ }
	 */

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	 * �Զ��巽�� public �������� ��������(){ }
	 */
	public String info() {
		return "����:" + name + " ����:" + age;
	}
}
