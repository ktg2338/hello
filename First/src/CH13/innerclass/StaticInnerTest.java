package CH13.innerclass;

class OutClass1{
	private int num = 10;
	private static int sNum =20;
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum =200;
	
		void inTest() {
			System.out.println("InStaticClass inNum = "+inNum+"(외부 클래스의 인스턴스변수)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(내부 클래스의 정적변수)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적변수)");
		}
		static void sTest() {
			System.out.println("아웃클라스 에스넘 =" +sNum +" (외부클라스 정적변수 사용)");
			System.out.println("인클라스 에스인넘 =" +sInNum +" (외부클라스 정적변수 사용)");
		}
	}

}


public class StaticInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass1.InStaticClass sInClass = new OutClass1.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메소드 호출");
		OutClass1.InStaticClass.sTest();
	}

}
