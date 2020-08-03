package CH13.innerclass;

class OutClass1{
	private int num = 10;
	private static int sNum =20;
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum =200;
	
		void inTest() {
			System.out.println("InStaticClass inNum = "+inNum+"(�ܺ� Ŭ������ �ν��Ͻ�����)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(���� Ŭ������ ��������)");
			System.out.println("OutClass sNum = "+sNum+"(�ܺ� Ŭ������ ��������)");
		}
		static void sTest() {
			System.out.println("�ƿ�Ŭ�� ������ =" +sNum +" (�ܺ�Ŭ�� �������� ���)");
			System.out.println("��Ŭ�� �����γ� =" +sInNum +" (�ܺ�Ŭ�� �������� ���)");
		}
	}

}


public class StaticInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass1.InStaticClass sInClass = new OutClass1.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼ҵ� ȣ��");
		OutClass1.InStaticClass.sTest();
	}

}
