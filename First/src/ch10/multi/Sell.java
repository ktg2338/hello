package ch10.multi;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
