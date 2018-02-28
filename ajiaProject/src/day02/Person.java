package day02;

public class Person {
    public String name;
    public int age;
	public int num;
	
	public String info(){
		return "ĞÕÃû: "+name+"  ÄêÁä:"+age+"  Ñ§ºÅ:"+num;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
