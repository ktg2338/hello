package ch04;

public class Q2P123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int i;
		
		for(dan = 2; dan<=9; dan++){
			for(i= 1; i <= 9; i++)
				if(dan % 2 == 0) 
					System.out.println(dan + "X" + i + "=" + dan*i);
				else
					continue;
		
		}
	}

}
		
