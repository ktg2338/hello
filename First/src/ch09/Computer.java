package ch09;

public abstract class Computer {

		public abstract void display();
		public abstract void typing();
		public void turnOn() {
			System.out.println("���� ��.");
		}
		public void turnOff() {
	    System.out.println("���� ��.");
	}
}

class DeskTop extends Computer {
	public void display() {
		System.out.println("����ũž ���÷���()");
	}
	public void typing() {
		System.out.println("����ũž Ÿ����()");
	}
	
}

abstract class NoteBook extends Computer {
	public void display() {
		System.out.println("��Ʈ�� ���÷���()");
	}
}

class MyNoteBook extends NoteBook {

	@Override
	public void typing() {
System.out.println("���̳�Ʈ�� Ÿ����()");
		
	}
	
}