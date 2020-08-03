package chQ06;

public class Q4Taketrans {

		public static void main(String[ ]args) {
			Q4Person K = new Q4Person("Kim", 5000);
			Q4Person L = new Q4Person("Lee", 5000);
			
			Star Ame = new Star("아메리카노");
			K.takeStar(Ame);
			K.showInfo();
			Ame.showInfo();
			
			Cong Lotte = new Cong("라떼");
			L.takeCong(Lotte);
			L.showInfo();
			Lotte.showInfo();
			
		}
	}

