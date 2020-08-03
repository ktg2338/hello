package chQ06;

public class Q4Person {

		public String pName;
		public int money;
		public Q4Person(String pName, int money) {
			this.pName = pName;
			this.money = money;
		}
	
		public void takeStar(Star Ame) {
			Ame.take(4000);
			this.money -= 4000;
		}
		public void takeCong(Cong Lotte) {
			Lotte.take(4500);
			this.money -= 4500;
		}
		public void showInfo() {
			System.out.println(pName + "님의 남은 돈은"+ money+ "원 입니다.");
		}
	
	}
