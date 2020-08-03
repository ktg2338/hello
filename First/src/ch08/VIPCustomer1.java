package ch08;

public class VIPCustomer1 {
	
		private int customerID;
		private String customerName;
		private String customerGrade;
		int bonusPoint;
		double bonusRatio;
		
		private int agentID;
		double saleRatio;
		
		public VIPCustomer1() {
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
		}
		
		public int calcprice(int price) {
			bonusPoint += price * bonusRatio;
			return price - (int)(price * saleRatio);		
		}
		
		public int getAgentID() {
			return agentID;
		}
		
		public String showCustomerInfo() {
			return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
		}
	}


