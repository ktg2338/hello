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
		System.out.printf("%s�� ���� %d���̰� ������ %d���Դϴ�.\n", Ame, passengerCount, money);
	}
}