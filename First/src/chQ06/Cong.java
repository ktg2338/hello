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
		System.out.printf("\"%s�� ���� %d���̰� ������ %d���Դϴ�.\n", congLotte, passengerCount, money);
	}
}
