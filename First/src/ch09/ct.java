package ch09;

import java.util.ArrayList;

public class ct {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata("�ҳ�Ÿ"));
//		carList.add(new Avante());
//		carList.add(new Grandeur());
//		carList.add(new Genesis());
		for(Car car : carList) {
			car.run();
			System.out.println("===================================");
		}
	}
}

class Sonata extends Car {

	public Sonata(String name) {

	}
	@Override
	public void drive() {
		System.out.println("�޸��ϴ�");
		
	}


	@Override
	public void stop() {
		System.out.println("����ϴ�");
		
	}
	}