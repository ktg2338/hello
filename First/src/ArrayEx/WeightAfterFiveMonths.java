package ArrayEx;

public class WeightAfterFiveMonths {
	  public static void main (String[] args) {
	    // �Է°� �ޱ� (main���� �Էº���: Run As => Run configuration)
	    // ���
	    double result = weight(72.4, 5);
	    int months = 5;
	    // ��� ���
	    System.out.printf("%d���� �� ���� ������ => %.2fkg", months ,result);
	  }
	  
	  // ���� �����Կ� n���� �� ���� �Է¹޾� ���� �����Ը� ��ȯ
	  public static double weight(double currentWeight, int months) {
	    double expectedWeight = currentWeight;
	    for (int i=0; i < months; i++){
	      expectedWeight += 0.231;
	    }
	    return expectedWeight;
	  }
	}