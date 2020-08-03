package CH13.innerclass;

class Outer2{
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("러버블이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
}
}


