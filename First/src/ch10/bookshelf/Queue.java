package ch10.bookshelf;

public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getSize();
}
