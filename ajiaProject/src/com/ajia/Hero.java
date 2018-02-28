package com.ajia;

public class Hero {
	String heroname;
	float heroHP;
	float heroArmor;
	int heroMoveSpeed;

	public Hero(String name, float HP, float Armor, int MoveSpeed) {
		this.heroname = name;
		this.heroHP = HP;
		this.heroArmor = Armor;
		this.heroMoveSpeed = MoveSpeed;
	}

	public static void main(String[] args) {
		//
		// 水仙花数定义：
		// 1. 一定是3位数
		// 2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
		// 寻找所有的水仙花数

		for (int i = 100; i <= 999; i++) {
			int g = i % 10;
			int s = i / 10 % 10;
			int b = i / 100;
			if (b * 100 + s * 10 + g == b * b * b + s * s * s + g * g * g) {
				System.out.println(b * 100 + s * 10 + g);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
