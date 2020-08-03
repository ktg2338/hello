package ch07;

public class FoodTest{
	public static void main(String[]args) {
		Food chicken = new Food("치킨", 18000);
		Food pizza = new Food("피자", 28000);
		Food sushi = new Food("초밥세트", 22000);
		
		Food[] foods = {chicken, pizza, sushi};
	
		for(int i=0; i<foods.length; i++) {
			System.out.println(foods[i].toString());
			foods[i].foodinfo();
		}
	}
	
}

class Food{
	private String foodname;
	private int price;
	
	public Food() {}
	public Food(String foodname, int price) {
		this.foodname = foodname;
		this.price = price;
		}
	public String toString() {
		return String.format("Food {name: %s, price: %d원 }", foodname,price);	
		
	}
	public void foodinfo() {
		System.out.println(foodname +", "+price);
	}
}