package ch06;

public class Taketrans {

		public static void main(String[ ]args) {
			Student j = new Student("James", 5000);
			Student t = new Student("tomas", 10000);
			Student l = new Student("Lola", 10000);
			Bus bus100 = new Bus(100);
			j.takebus(bus100);
			j.showInfo();
			bus100.showInfo();
			
			Subway subwayG = new Subway("2ȣ��");
			t.takesubway(subwayG);
			t.showInfo();
			subwayG.showInfo();
			
			Taxi Blue = new Taxi(777);
			l.taketaxi(Blue);
			l.showInfo();
			Blue.showInfo();
			l.takesubway(subwayG);
			l.showInfo();
			subwayG.showInfo();
			l.takebus(bus100);
			l.showInfo();
			bus100.showInfo();
		}
	}
class Taxi{
	int taxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(int number) {
		taxiNumber = number;
	}
	public void take (int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.printf("�ý� %s�� �°��� %d���̰� ������ %d���Դϴ�.\n", taxiNumber, passengerCount, money);
		}
	}