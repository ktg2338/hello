package ch10.multi;

public class Customer  implements Buy, Sell {

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("고객 판매 주문");
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}

}