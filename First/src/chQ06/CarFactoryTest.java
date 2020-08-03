package chQ06;

class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	//private 생성자 : 외부 클래스에서 이 생성자를 사용할수 없음
	private CarFactory() {}
	
	//외부 클래스에서 사용가능
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}


	}


class Car{
	
	private int carNumber;
	private static int serialNum = 10000;
	
	Car(){
		serialNum++;
		carNumber = serialNum;
	}

	public int getCarNumber() {
		return carNumber;
	}
}

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
//		Car mySonata = factory.createCar();
//		Car yourSonata = factory.createCar();
//		System.out.println(mySonata.getCarNumber());
//		System.out.println(yourSonata.getCarNumber());
	}

}


