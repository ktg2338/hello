package ch08;

public class CustomerTest {
	
	public static void main(String[] args) {
//		Customer Lee = new Customer(10010,"�̼���");
//		Lee.setCustomerID(10010);
//		Lee.setCustomerName("�̼���");
//		Lee.bonusPoint = 1000;
//
//		
//		VIPCustomer Kim = new VIPCustomer(10020, "������", 12345);
////		Kim.setCustomerID(10020);
////		Kim.setCustomerName("������");
//		Kim.bonusPoint = 10000;
//		int price = 10000;
//		
//		System.out.println(Lee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� "+ Lee.calcprice(price)+ "�� �Դϴ�");
//		System.out.println(Kim.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� "+ Kim.calcprice(price)+ "�� �Դϴ�");
	Customer lee = new Customer();
	lee.setCustomerID(10010);
	lee.setCustomerName("�̼���");
	lee.bonusPoint = 1000;
	System.out.println(lee.showCustomerInfo());
	
	Customer kim = new VIPCustomer(10020,  "������", 12345);
	kim.bonusPoint = 1000;
	System.out.println(kim.showCustomerInfo());
	
	System.out.println("============�������� ���ʽ� ����Ʈ ���=============");
	
	int price = 10000;
	int leePrice = lee.calcprice(price);
	int kimPrice= kim.calcprice(price);
	System.out.println(lee.getCustomerName() + "����" + leePrice + "���� �����ϼ̽��ϴ�.");
	System.out.println(lee.showCustomerInfo());
	System.out.println(kim.getCustomerName() + "����" + kimPrice + "���� �����ϼ̽��ϴ�.");
	System.out.println(kim.showCustomerInfo());
	}
	
}