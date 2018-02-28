package day05;

public class Danli03 {

	public static void main(String[] args) {
		Singleton03 sg=Singleton03.get();
		sg.print();
	}

}

class Singleton03{
	private static  Singleton03 sg3=null;
	private Singleton03(){
		
	}
	public void print(){
		System.out.println("单例设计模式懒汉式");
	}
	public static Singleton03 get(){
		if (sg3==null) {
			sg3=new Singleton03();
		}
		return sg3;
	}
}
