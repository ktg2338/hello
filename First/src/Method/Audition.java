package Method;

public class Audition {
	public static void main(String[] args) {
	double tomVocal = 8.8;
	double tomDance = 7.6;
	double kateVocal = 9.2;
	double kateDance = 7.8;
	
	System.out.printf("Tom의 오디션 결과: %s\n", test(tomVocal, tomDance));
	System.out.printf("Kate의 오디션 결과: %s\n", test(kateVocal, kateDance));
	}
	  
	public static String test(double vocal, double dance){
		if((vocal * dance) > 70)
			return "통과";
		else
			return "탈락";
	}
}

