package ch08;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer lee = new Customer(10010, "�̼���");
		Customer shin = new Customer(10010, "�Ż��Ӵ�");
		Customer hong = new GoldCustomer(10010, "ȫ�浿");
		Customer youl = new GoldCustomer(10010, "������");
		Customer kim = new VIPCustomer(10010, "������", 12345);
	
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(kim);
		
		System.out.println("========���������============");
		for(Customer c : customerList) {
			System.out.println(c.showCustomerInfo());
		}
		System.out.println("========�������� ���ʽ� ����Ʈ ���==========");
		int price = 10000;
		for(Customer c : customerList) {
			int cost = c.calcprice(price);
			System.out.println(c.getCustomerName()+ " ����" + cost + "�� �����ϼ˽��ϴ�.");
			System.out.println(c.getCustomerName()+ " ���� ���� ���ʽ� ����Ʈ" + c.bonusPoint + "���Դϴ�.");
		}
	}

}
