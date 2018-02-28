package day04;

public class Interface02 {

	public static void main(String[] args) {
		Fanqie fq=new Fanqie();
		fq.caoCai();
		fq.eat();
		fq.liangBan();
		fq.zhongLei();
	}

}

interface Fruit{
	public abstract void zhongLei();
	public abstract void eat();
}

interface Shucai{
	public abstract void caoCai();
	public abstract void liangBan();
}

class Fanqie implements Fruit,Shucai{

	@Override
	public void zhongLei() {
		System.out.println("番茄是一种蔬菜也是一种水果");
	}

	@Override
	public void eat() {
		System.out.println("吃番茄");
	}

	@Override
	public void caoCai() {
		System.out.println("番茄可以炒菜");
	}

	@Override
	public void liangBan() {
		System.out.println("番茄可以凉拌");
	}
	
}
