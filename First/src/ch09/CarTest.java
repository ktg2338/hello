package ch09;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========ai차==========");
		Car myCar = new AICar();
		myCar.run();
		System.out.println("=========수동차==========");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
