package ch05;

public class Grade {
	public int math;
	public int science;
	public int english;

	public Grade(int math, int science, int english){
		this.math = 90;
		this.science = 88;
		this.english = 96;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public float avg() {
		int result = (math + science + english)/3;
		return result;
		}

	}

