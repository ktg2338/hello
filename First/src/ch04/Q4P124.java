package ch04;

public class Q4P124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		int x = 3;
		  for(int i = 1; i <= n; i++){   
			  for(int j = 0; j <= n-1-i; j++){
				  System.out.print(" ");
				  	
			  }
			  for(int j = 1; j <= 2*i-1; j++){
				  System.out.print("*");
			  }
			  System.out.println();
		  }  
		  for(int i = 1; i <= x; i++){   
			  for(int j = 0; j <= n-5+i; j++){
				  System.out.print(" ");
			  }
			  
			  for(int j = 1; j <= 7-2*i; j++){
				  System.out.print("*");	
			  }
			  System.out.println();
		}
   	}
}