package ch06;

class Student1{
	public static int serialN = 1000;
	public static int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}

public class StudentTest1 {

	public static void main(String[] args) {
		Student1 Lee = new Student1();
		Lee.setStudentName("ÀÌÁö¿ø");
		System.out.println(Lee.studentName);
		System.out.println(Lee.serialN);
		Lee.serialN++;
		Math.random();
		
		Student1 Son = new Student1();
		Son.setStudentName("¼ÕÈï¹Î");
		System.out.println(Son.studentName);
		System.out.println(Son.serialN);
		Son.serialN++;

	}

}
