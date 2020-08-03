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
		System.out.println("õõ�� �޸�");
	}
	public void jump() {
		System.out.println("���� ����");
	}
	public void turn() {
		System.out.println("�ϸ���");
	}
	public void showLevelMessage() {
		System.out.println("=====�ʺ���=====");
	}
}

class AdvancedLevel extends PlayerLevel {
	
	public void run() {
		System.out.println("���� �޸�");
	}
	public void jump() {
		System.out.println("���� ����");
	}
	public void turn() {
		System.out.println("�ϸ���");
	}
	public void showLevelMessage() {
		System.out.println("=====�߱�=====");
	}
}

class SuperLevel extends PlayerLevel {
	
	public void run() {
		System.out.println("��û ���� �޸�");
	}
	public void jump() {
		System.out.println("�������� ����");
	}
	public void turn() {
		System.out.println("���ϰ���");
	}
	public void showLevelMessage() {
		System.out.println("=====���=====");
	}
}
