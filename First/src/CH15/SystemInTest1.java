package CH15;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("알파벳 하나를 쓰고 엔터를 누르시오");

int i;
try {
	i = System.in.read();
	System.out.println(i);
	System.out.println((char)i);
} catch (IOException e) {
	e.printStackTrace();
	}
	}
}
