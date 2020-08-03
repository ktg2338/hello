package ch08;

public class CurrencyTest {
	  public static void main(String[] args) {
	    // ��ü ����
	    KRW krw = new KRW(1500, "��");
	    USD usd = new USD(100.50, "�޷�");
	    EUR eur = new EUR(260.87, "����");
	    JPY jpy = new JPY(1400, "��");

	    // �θ� Ŭ������ ���� �׷�ȭ
	    Currency[] currencies = { krw, usd, eur, jpy };

	    // ��� ȭ�������� ���
	    for (Currency c : currencies) {
	      System.out.println(c.toString());
	    }
	  }
	}

	/* 1. �θ� Ŭ���� Currency�� ����ÿ�. */
class Currency {
	private double amount;
	private String notation;
	
	public Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	public double getAmount() {
		return amount;
	}
	public String getNotatoion() {
	return notation;
	}
}
	/* 2. ����� ���� �ߺ� �ڵ带 ���� ��, */
	/* 3. �����ڸ� �ùٸ��� �����Ͻÿ�. */
	/* 4. toString() �޼ҵ带 �������̵� �Ͻÿ�. */
	class KRW extends Currency{
		public KRW(double amount, String notation) {
			super(amount, notation);
	  }
		@Override
		public String toString() {
			return String.format("krw: %.2f %s", super.getAmount(), super.getNotatoion());
		}
		
	}

	class USD extends Currency{
		public USD(double amount, String notation) {
			super(amount, notation);
	  }
		@Override
		public String toString() {
			return String.format("usd: %.2f %s", super.getAmount(), super.getNotatoion());
		}
		
	}class EUR extends Currency{
		public EUR(double amount, String notation) {
			super(amount, notation);
	  }
		@Override
		public String toString() {
			return String.format("eur: %.2f %s", super.getAmount(), super.getNotatoion());
		}
		
	}class JPY extends Currency{
		public JPY(double amount, String notation) {
			super(amount, notation);
	  }
		@Override
		public String toString() {
			return String.format("jpy: %.2f %s", super.getAmount(), super.getNotatoion());
		}
		
	}