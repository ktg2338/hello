package ch05;

import java.util.Scanner;

public class Gradetest {

	public static void main(String[] args) {

	// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	

	System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");

	int math = sc.nextInt();

	int science = sc.nextInt();

	int english = sc.nextInt();
	
	Grade myGrade = new Grade(math, science, english);
	
	System.out.println("����� "+ myGrade.avg()); // average()�� ����� ����Ͽ� ����
	
	sc.close();
	}		
}



