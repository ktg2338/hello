package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		c2.display();
		c2.typing();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		c4.display();
		c4.typing();
	}

}
