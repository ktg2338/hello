package CH02;

public class Conversion {

	public static void main(String[] args) {
		// 자료형 변환, 묵시적 형 변환(자동)
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		

	}

}
