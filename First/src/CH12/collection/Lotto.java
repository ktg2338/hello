package CH12.collection;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {		
		// ��ü ����
		LottoMachine machine = new LottoMachine();
		
		// �ζ� ��ȣ ��������
		int[] numbers = machine.getLottoNumbers();
		
		// ��� ���
		System.out.print("���� ��ȣ: ");
		for (int i : numbers) {
			System.out.printf("%d ", i);
		}
	}
}

class LottoMachine {
	// �ʵ�
	private int[] LottoNumbers;

	// ������
	public LottoMachine() {
		/* 2. �޼ҵ带 �̿��ؼ� �ζǹ�ȣ ���� �ʱ�ȭ */;
		LottoNumbers = generate();	
	}

	// �޼ҵ�
	public int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();

		/* 1. ������ ���� 6���� �����ϼ���. */
		for(int i = 0; i<6; i++) {
			int number = rand.nextInt(45)+1;
			pickedNumbers[i] = number;
			
			for(int j = 0; j<i; j++) {
				if(pickedNumbers[j] == number) i--;
			}
		}

		return pickedNumbers;
	}

	public int[] getLottoNumbers() {
		return LottoNumbers;
	}
    
    /* 3.������ �ζǹ�ȣ�� �������� get�޼ҵ带 ��������. */
	
	
}