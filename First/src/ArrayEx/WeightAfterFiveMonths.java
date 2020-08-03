package ArrayEx;

public class WeightAfterFiveMonths {
	  public static void main (String[] args) {
	    // 입력값 받기 (main문의 입력변수: Run As => Run configuration)
	    // 계산
	    double result = weight(72.4, 5);
	    int months = 5;
	    // 결과 출력
	    System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", months ,result);
	  }
	  
	  // 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
	  public static double weight(double currentWeight, int months) {
	    double expectedWeight = currentWeight;
	    for (int i=0; i < months; i++){
	      expectedWeight += 0.231;
	    }
	    return expectedWeight;
	  }
	}