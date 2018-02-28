package day05;

//多例设计模式
public class Duoli {

	public static void main(String[] args) {
		Sex ss = Sex.get(Sex.SECRETS);
		System.out.println(ss);
	}

}

class Sex {
	public final static int NANS = 1;//定义常量1表示男
	public final static int NVS = 2;//定义常量2表示女
	public final static int SECRETS = 3;//定义常量3表示保密
    //实例化对象
	private final static Sex NAN = new Sex("男");
	private final static Sex NV = new Sex("女");
	private final static Sex SECRET = new Sex("保密");

	private String title;//定义属性

	private Sex(String title) {//构造方法私有化
		this.title = title;//在实例化的时候进行赋值
	}
    //覆写Object中toString方法
	public String toString() {
		return this.title;//返回title
	}
    //通过外部方法实例化
	public static Sex get(int a) {
		switch (a) {
		case 1:
			return NAN;
		case 2:
			return NV;
		case 3:
			return SECRET;
		default:
			return null;
		}

	}

}
