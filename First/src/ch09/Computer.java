package ch09;

public abstract class Computer {

		public abstract void display();
		public abstract void typing();
		public void turnOn() {
			System.out.println("전원 켬.");
		}
		public void turnOff() {
	    System.out.println("전원 끔.");
	}
}

class DeskTop extends Computer {
	public void display() {
		System.out.println("데스크탑 디스플레이()");
	}
	public void typing() {
		System.out.println("데스크탑 타이핑()");
	}
	
}

abstract class NoteBook extends Computer {
	public void display() {
		System.out.println("노트북 디스플레이()");
	}
}

class MyNoteBook extends NoteBook {

	@Override
	public void typing() {
System.out.println("마이노트북 타이핑()");
		
	}
	
}