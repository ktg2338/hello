package Method;

public class Grade {
	public static void main(String[] args) {
	int score1 = 96;
	int score2 = 85;
	int score3 = 76;
	
	System.out.printf(" %d점 = %s\n" , score1, GC(score1));
	System.out.printf(" %d점 = %s\n" , score2, GC(score2));
	System.out.printf(" %d점 = %s\n" , score3, GC(score3));
	}
	  
	public static String GC(int a){
		if(a > 100  && a < 0)
			return "점수 오류";
		if(100 >= a && a >= 95)
			return "A+";
		if(a >= 90)
			return "A0";
		if(a >= 80 )
			return "B+";
		if(a >= 69)
			return "B0";
		else
			return "C+";
	}
}

