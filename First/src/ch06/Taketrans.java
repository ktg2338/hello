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
			
			Subway subwayG = new Subway("2호선");
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
		System.out.printf("택시 %s의 승객은 %d명이고 수입은 %d원입니다.\n", taxiNumber, passengerCount, money);
		}
	}