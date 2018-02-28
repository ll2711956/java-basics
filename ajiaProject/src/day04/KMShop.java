package day04;

/*
 * 总结
 *  1、接口避免了单继承，一个子类可以实现多个接口。
 *  2、接口的实现一定定义一个子类，通过implements 来实现接口。
 *  3、接口中方法全部是抽象方法，全局常量的定义可以不加static。
 *  4、接口要实现必须要子类，通过向上转换来实现接口实例化。
 *  
 *  开发中接口的使用原则
 *  1、表示的是一种操作标准和规则
 *  2、表示的是一种能力
 *  3、将服务器端的远程方法提供客户端
 */
public class KMShop extends KFCAbstract implements KFC {

	@Override
	public void shutiao() {
		System.out.println("KFC昆明分店薯条的颜色是" + COLOR);
	}

	@Override
	public void hanbao() {
		System.out.println("KFC昆明分店汉堡很nice");
	}

	@Override
	public void kele() {
		System.out.println("KFC昆明分店可乐不好喝");
	}

	@Override
	public void zhaShutiao() {
		System.out.println("昆明分店的炸薯条很不错");
	}

	@Override
	public void zuoHanbao() {
		System.out.println("昆明分店的薯条有点小");
	}

	public static void main(String[] args) {
		KMShop kms = new KMShop();
		kms.shutiao();
		kms.hanbao();
		kms.kele();
		kms.zhaShutiao();
		kms.zuoHanbao();
	}
}
