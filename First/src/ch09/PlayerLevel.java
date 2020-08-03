package ch09;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count ) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}

class BeginnerLevel extends PlayerLevel {
	
	public void run() {
		System.out.println("천천히 달림");
	}
	public void jump() {
		System.out.println("점프 못함");
	}
	public void turn() {
		System.out.println("턴못함");
	}
	public void showLevelMessage() {
		System.out.println("=====초보자=====");
	}
}

class AdvancedLevel extends PlayerLevel {
	
	public void run() {
		System.out.println("빨리 달림");
	}
	public void jump() {
		System.out.println("점프 가능");
	}
	public void turn() {
		System.out.println("턴못함");
	}
	public void showLevelMessage() {
		System.out.println("=====중급=====");
	}
}

class SuperLevel extends PlayerLevel {
	
	public void run() {
		System.out.println("엄청 빨리 달림");
	}
	public void jump() {
		System.out.println("높이점프 가능");
	}
	public void turn() {
		System.out.println("턴턴가능");
	}
	public void showLevelMessage() {
		System.out.println("=====고급=====");
	}
}
