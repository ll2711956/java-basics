package com.ajia;

public class Hero1 {
	String heroName;
	float heroHP;
	float heroArmor;
	int heroMoveSpeed;
	float blood;

	public Hero1(String name, float HP, float Armor, int Movespeed, float blood) {
		this.heroName = name;
		this.heroHP = HP;
		this.heroArmor = Armor;
		this.heroMoveSpeed = Movespeed;
		this.blood = blood;
	}

	public void legendary() {

	}

	public float getHeroHP() {
		return heroHP;
	}

	public void setHeroHP(float heroHP) {
		this.heroHP = heroHP;
	}

	public void recovery(float blood) {

	}

}
