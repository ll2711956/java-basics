package day04;

public class Market {

	public static void main(String[] args) {
		Market01 m1=Factory08.getInstance(args[0]);
		if (m1!=null) {
			m1.print();
		}
	}

}

interface Market01{
	void print();
}

class Factory08{
	public static Market01 getInstance(String aa){
		if ("Woerma".equals(aa)) {
			return new Woerma();
		}else if("Jialefu".equals(aa)){
			return new Jialefu();
		}else if("Wanlian".equals(aa)){
			return new Wanlian();
		}else{
			return null;
		}
		
	}
}
class Woerma implements Market01{

	@Override
	public void print() {
		System.out.println("去沃尔玛买东西");
	}
	
}

class Jialefu implements Market01{

	@Override
	public void print() {
		System.out.println("去家乐福买东西");
	}
	
}

class Wanlian implements Market01{

	@Override
	public void print() {
        System.out.println("去万联买东西");		
	}
	
}
