package CH15;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

System.out.println("�̸�");
String name = scanner.nextLine();
System.out.println("����");
String job = scanner.nextLine();
System.out.println("���");
int num = scanner.nextInt();

System.out.println(name);
System.out.println(job);
System.out.println(num);
	}

}
