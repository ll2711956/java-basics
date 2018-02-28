package com.ajia;

public class Ifdemo {

	public static void main(String[] args) {
		int money = 10000;
		double sui = money - 3500;
		if (sui <= 0) {
			System.out.println("应缴税:" + 0);
		} else if (sui <= 1500) {
			System.out.println("应缴税:" + (sui * 0.03 - 0));
		} else if (sui <= 4500) {
			System.out.println("应缴税:" + (sui * 0.1 - 105));
		} else if (sui <= 9000) {
			System.out.println("应缴税:" + (sui * 0.2 - 555));
		} else if (sui <= 35000) {
			System.out.println("应缴税:" + (sui * 0.25 - 1005));
		} else if (sui <= 55000) {
			System.out.println("应缴税:" + (sui * 0.3 - 2755));
		} else if (sui <= 80000) {
			System.out.println("应缴税:" + (sui * 0.35 - 5505));
		} else if (sui >= 80000) {
			System.out.println("应缴税:" + (sui * 0.45 - 13505));
		}
	}

}
