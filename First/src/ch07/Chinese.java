package ch07;

public class Chinese{
	public static void main(String[] args) {
		menu jja = new menu("¥��", 4900);
		menu jjam = new menu("«��", 5900);
		menu tang = new menu("������", 13900);
		
		menu[] menuArr = {jja, jjam, tang};
		Order order = new Order(123, menuArr);
		
		System.out.printf("�ֹ� �հ� : %d��",order.totalprice());
			}
	}

class menu{
	String name;
	public int price;
	
	public menu(String str, int i) {
		name = str;
		price = i;
		}
}
class Order{
	int orderN;
	menu[] menus;
	
	public Order(int i, menu[] arr) {
		orderN = i;
		menus = arr;
	}
	public int totalprice() {
		int sum = 0;
		for(int i = 0; i<menus.length; i++) {
			sum = sum + menus[i].price;
		}
		return sum;
	}
}	