package ch03;

public class operEx5 {

	public static void main(String[] args) {
		int num = 0B00000101; //0B = ÀÌÁø¼ö
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num);
		num = num << 2;
		System.out.println(num);
	}

}
