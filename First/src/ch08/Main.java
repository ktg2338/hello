package ch08;

public class Main {
	public static void main(String[] args) {
		// 서로 다른 객체 생성
		Juice j = new Juice();
		j.name = "쥬스";
		Coffee c = new Coffee();
		c.name = "커피";
		Beer b = new Beer();
		b.name = "맥주";
		Water w = new Water();
		w.name = "생수";
		Tea t = new Tea();
		t.name = "티";

		// 부모 클래스 타입의 배열 생성
		Drink[] drinks = { j, c, b, w, t };

		// 모든 음료를 주문!
		for (Drink d : drinks) {
			d.ordered();
		}
	}
}

class Drink {
	String name;
	double price;
	public void ordered() {
		System.out.println("주문되었습니다.");

	}
}

class Juice extends Drink {
	String name;
	double price;

	public void ordered() {
		System.out.println(name + "주문되었습니다.");
	}
}

class Coffee extends Drink {
	String name;
	double price;

	public void ordered() {
		System.out.println(name + "주문되었습니다.");
	}
}

class Beer extends Drink {
	String name;
	double price;

	public void ordered() {
		System.out.println(name + "주문되었습니다.");
	}
}

class Water extends Drink {
	String name;
	double price;

	public void ordered() {
		System.out.println(name + "주문되었습니다.");
	}
}

class Tea extends Drink {
String name;
double price;

public void ordered() {
	    System.out.println(name + "주문되었습니다.");
}
}