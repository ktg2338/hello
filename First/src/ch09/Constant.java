package ch09;

public class Constant {
	int num = 10;
	static final int NUM = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Constant.NUM);
		Constant cons = new Constant();
		cons.num = 50;
//		cons.NUM = 200;
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
		
		System.out.println(Math.PI);
//		Math.PI = 3.145;
		
		
	}

}
