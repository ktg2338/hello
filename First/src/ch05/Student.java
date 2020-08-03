package ch05;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName(){
		return studentName;
	}
	
	public static void main(String[] args){
		Student Ahn = new Student();
		Ahn.studentName = "¾È¿¬¼ö";
		
		System.out.println(Ahn.studentName);
		System.out.println(Ahn.getStudentName());
		
		
	}
}
