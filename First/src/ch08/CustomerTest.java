package ch08;

public class CustomerTest {
	
	public static void main(String[] args) {
//		Customer Lee = new Customer(10010,"이순신");
//		Lee.setCustomerID(10010);
//		Lee.setCustomerName("이순신");
//		Lee.bonusPoint = 1000;
//
//		
//		VIPCustomer Kim = new VIPCustomer(10020, "김유신", 12345);
////		Kim.setCustomerID(10020);
////		Kim.setCustomerName("김유신");
//		Kim.bonusPoint = 10000;
//		int price = 10000;
//		
//		System.out.println(Lee.getCustomerName() + "님이 지불해야 하는 금액은 "+ Lee.calcprice(price)+ "원 입니다");
//		System.out.println(Kim.getCustomerName() + "님이 지불해야 하는 금액은 "+ Kim.calcprice(price)+ "원 입니다");
	Customer lee = new Customer();
	lee.setCustomerID(10010);
	lee.setCustomerName("이순신");
	lee.bonusPoint = 1000;
	System.out.println(lee.showCustomerInfo());
	
	Customer kim = new VIPCustomer(10020,  "김유신", 12345);
	kim.bonusPoint = 1000;
	System.out.println(kim.showCustomerInfo());
	
	System.out.println("============할인율과 보너스 포인트 계산=============");
	
	int price = 10000;
	int leePrice = lee.calcprice(price);
	int kimPrice= kim.calcprice(price);
	System.out.println(lee.getCustomerName() + "님이" + leePrice + "원을 지불하셨습니다.");
	System.out.println(lee.showCustomerInfo());
	System.out.println(kim.getCustomerName() + "님이" + kimPrice + "원을 지불하셨습니다.");
	System.out.println(kim.showCustomerInfo());
	}
	
}