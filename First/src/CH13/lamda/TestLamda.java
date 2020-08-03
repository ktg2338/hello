package CH13.lamda;
interface PrintString{
	void showString(String str);
}

public class TestLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintString reStr = returnString();
		reStr.showString("hello");
	}

	public static void showMyString(PrintString p) {
		p.showString("hello landa_2");
	}
}
