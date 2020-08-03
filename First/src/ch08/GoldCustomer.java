package ch08;

public class GoldCustomer extends Customer {
	double saleRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		this.customerGrade = "gold";
		this.bonusRatio = 0.02;
		this.saleRatio = saleRatio;
	}
	public int calcprice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
}
