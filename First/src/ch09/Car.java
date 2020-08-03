package ch09;

public abstract class Car {
		public abstract void drive();
		public abstract void stop();
	
		public String name() {
			super name;
		}
		public void startCar() {
			System.out.println("시동 킴");
		}
			public void turnOff() {
				System.out.println("시동 끔");
		}
			final public void run() {
				startCar();
				drive();
				stop();
				turnOff();
			}
	}

class AICar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율주행");
		System.out.println("자동 방향전환");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("스스로 멈춤");
	}
	@Override
	public void startCar() {
		System.out.println("자동 시동");
	}
}


class ManualCar extends Car {
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람운전");
		System.out.println("사람핸들조작");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("브레이크");
	}

	@Override
	public void startCar() {
		System.out.println("수동 시동");
	}
}