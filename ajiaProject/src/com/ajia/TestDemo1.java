package com.ajia;

public class TestDemo1 {
	/*
	 * this 关键字指代当前类
	 */
	public static void main(String[] args) {
		Person per = new Person("李四", 28);
		System.out.println(per.info());
	}
}

class Person {
	private String name;
	private int age;
	/*
	 * 构造方法用来初始化操作 public 类名称(){ }
	 */

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	 * 自定义方法 public 返回类型 方法名称(){ }
	 */
	public String info() {
		return "姓名:" + name + " 年龄:" + age;
	}
}
