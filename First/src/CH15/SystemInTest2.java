package CH15;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("���ĺ� ������");

int i;
try {
	while((i = System.in.read()) != -1) {
		System.out.println((char)i);
	}
}catch (IOException e) {
	e.printStackTrace();
}
	}

}
