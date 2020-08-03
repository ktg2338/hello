package ch07;
import java.util.ArrayList;

public class StudentTest{
	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);
		
		Student studentKim = new Student(1002,"Kim");
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 100);
		
		studentLee.showStudentInfo();
		System.out.println("============================================");
		studentKim.showStudentInfo();
	}
}

class Student{
	int studentID;
	String studentName;
	ArrayList<Subject> subjectlist; // ���� ��ü�� ����ִ� arrlist
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectlist = new ArrayList<Subject>();
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectlist.add(subject);
	}	
	public void showStudentInfo(){
		
		int total = 0;
		for(Subject s: subjectlist){
			total += s.getScorePoint();
			System.out.printf("�л�%s�� %s���� ������ %d�� �Դϴ�.\n", studentName, s.getName(), s.getScorePoint());
		}
	System.out.printf("�л�%s�� ������ %d�� �Դϴ�.\n", studentName, total);
	}
}
		
class Subject{
	private String name;
	private int scorePoint;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
}