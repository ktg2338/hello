package ch07;
import java.util.ArrayList;

public class StudentTest{
	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002,"Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("============================================");
		studentKim.showStudentInfo();
	}
}

class Student{
	int studentID;
	String studentName;
	ArrayList<Subject> subjectlist; // 과목 객체를 담고있는 arrlist
	
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
			System.out.printf("학생%s의 %s과목 성적은 %d점 입니다.\n", studentName, s.getName(), s.getScorePoint());
		}
	System.out.printf("학생%s의 총점은 %d점 입니다.\n", studentName, total);
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