package ch04;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dan;
		int i;
		for ( dan = 2; dan<=10000; dan++) {
			for(i= 1; i<= 10000; i++)
				System.out.println(dan + "X" + i + "=" + dan*i);
		}
	}
}
