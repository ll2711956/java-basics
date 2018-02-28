package day05;

public class Danli02 {

	public static void main(String[] args) {
		Singleton02 s3=Singleton02.info();
		s3.print();
	}

}

class Singleton02{
	private final static Singleton02 GET=new Singleton02();
	private Singleton02(){
		
	}
	public void print(){
		System.out.println("ÔçË¯ÔçÆð");
	}
	public static Singleton02 info(){
		return GET;
	}
}