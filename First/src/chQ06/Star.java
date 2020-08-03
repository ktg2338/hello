package chQ06;

public class Star {
	String Ame;
	int passengerCount;
	int money;

	public Star(String starAme) {
		this.Ame = starAme;
	}
	public void take (int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.printf("%s의 고객은 %d명이고 수입은 %d원입니다.\n", Ame, passengerCount, money);
	}
}