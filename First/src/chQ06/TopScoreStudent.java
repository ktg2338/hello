package chQ06;

public class TopScoreStudent {
	  public static void main(String[] args) {
	    // �迭 ����
	    String[] names = {"el","su","jo","em","ne","ka","al","da","ha"};
	    int[] scores = {65,74,23,75,68,96,88,98,54};
	    
	    // 1�� �ε��� �˻�
	    int i = topIndex(scores);
	    
	    // ��� ���
	    System.out.printf("1��: %s(%d��)\n", names[i], scores[i]);
	  }

	  // ������ �迭�� �Է¹޾� ���� ū ���� �ε����� ��ȯ
	  public static int topIndex(int[] arr) {
	    /* �ش� �Լ��� �ϼ��ϼ���. */
		  int compare = 0;
		  int result = 0;
		  
		  for (int i = 0; i<arr.length; i++) {
			  if( compare < arr[i]) {
				  compare = arr[i];
				  result =i;
			  }
		  }
	    return result;
	  }
	}