package ch06;

public class Student {

		public String studentName;
		public int grade;
		public int money;
		public Student(String studentName, int money) {
			this.studentName = studentName;
			this.money = money;
		}
	
		public void takebus(Bus bus) {
			bus.take(1000);
			this.money -= 1000;
		}
		public void takesubway(Subway subway) {
			subway.take(1500);
			this.money -= 1500;
		}
		public void taketaxi(Taxi taxi) {
			taxi.take(3000);
			this.money -= 3000;
		}
		public void showInfo() {
			System.out.println(studentName + "´ÔÀÇ ³²Àº µ·Àº"+ money+ "¿ø ÀÔ´Ï´Ù.");
		}
	
	}
