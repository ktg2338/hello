package chQ06;

public class Cong {
	String congLotte;
	int passengerCount;
	int money;

	public Cong(String congLotte) {
		this.congLotte = congLotte;
	}
	public void take (int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.printf("\"%s의 고객은 %d명이고 수입은 %d원입니다.\n", congLotte, passengerCount, money);
	}
}
