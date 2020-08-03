package Method;

public class Oneline {
	public static void main(String[] args) {
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");
	}
	
	public static void threeLines() {
		int i = 0;
		while(i < 3) {
		System.out.println(">");
		i++;
		}
	}
	
	public static void oneLine() {
		System.out.println();
	}
}

