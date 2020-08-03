package ch08;

public class Main {
	public static void main(String[] args) {
		// ���� �ٸ� ��ü ����
		Juice j = new Juice();
		j.name = "�꽺";
		Coffee c = new Coffee();
		c.name = "Ŀ��";
		Beer b = new Beer();
		b.name = "����";
		Water w = new Water();
		w.name = "����";
		Tea t = new Tea();
		t.name = "Ƽ";

		// �θ� Ŭ���� Ÿ���� �迭 ����
		Drink[] drinks = { j, c, b, w, t };

		// ��� ���Ḧ �ֹ�!
		for (Drink d : drinks) {
			d.ordered();
		}
	}
}

class Drink {
	String name;
	double price;
	public void ordered() {
		System.out.println("�ֹ��Ǿ����ϴ�.");

	}
}

class Juice extends Drink {
	String name;
	double price;

	public void ordered() {
		System.out.println(name + "�ֹ��Ǿ����ϴ�.");
	}
}

class Coffee extends Drink {
	String name;
	double price;

	public void ordered() {
		System.out.println(name + "�ֹ��Ǿ����ϴ�.");
	}
}

class Beer extends Drink {
	String name;
	double price;

	public void ordered() {
		System.out.println(name + "�ֹ��Ǿ����ϴ�.");
	}
}

class Water extends Drink {
	String name;
	double price;

	public void ordered() {
		System.out.println(name + "�ֹ��Ǿ����ϴ�.");
	}
}

class Tea extends Drink {
String name;
double price;

public void ordered() {
	    System.out.println(name + "�ֹ��Ǿ����ϴ�.");
}
}