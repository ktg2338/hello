package ch09;

public abstract class Car {
		public abstract void drive();
		public abstract void stop();
	
		public String name() {
			super name;
		}
		public void startCar() {
			System.out.println("�õ� Ŵ");
		}
			public void turnOff() {
				System.out.println("�õ� ��");
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
		System.out.println("��������");
		System.out.println("�ڵ� ������ȯ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ ����");
	}
	@Override
	public void startCar() {
		System.out.println("�ڵ� �õ�");
	}
}


class ManualCar extends Car {
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("�������");
		System.out.println("����ڵ�����");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�극��ũ");
	}

	@Override
	public void startCar() {
		System.out.println("���� �õ�");
	}
}