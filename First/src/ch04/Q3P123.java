package ch04;

public class Q3P123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int i;
		
		for(dan = 2; dan<=9; dan++){
			for(i= 1; i <= 9; i++)
				if(dan >= i) 
					System.out.println(dan + "X" + i + "=" + dan*i);
				else
					break;
		
		}
	}

}
		
