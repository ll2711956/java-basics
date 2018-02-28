package day04;

//Object类是所有类的爸爸(父类)
public class Object01 {
	                        // 申明了args数组
	public static void main(String[] args) {
		// 向上转型
		Object ob = new Person("张三", 18);
		// 向下转型
		Person per = (Person) ob;
		System.out.println(per.info());
		// 向上转型
		Object obj = args;  //-->Object obj = new String();
		// 向上转型
		Object objs = new BB();
		
		Person per1=new Person("李四",19);
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
		return "姓名:" + name + ",年龄" + age;
	}
	
	//覆写Object类中toString的方法
	public String toString(){
		return "姓名:" + name + ",年龄" + age;
	}
}