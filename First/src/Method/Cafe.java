package Method;

public class Cafe {
	public static void main(String[] args) {
		PP(10.00, 40);
		PP(10.00, 50);
		PP(7.50, 38);
		PP(8.50, 66);
	}
	  
	public static void PP(double pay, int hour){
		double weekpay = pay*hour;
		double result = 0;
		
		if(hour > 60) {
			System.out.println("초과 근무시간 에러");
			return;
			}
				
		if(pay < 8) {
			System.out.println("최저 시급 에러");
			return;
			}
						
		if(hour > 40 && pay >= 8)
			result = (pay*40) + (pay*1.5)*(hour-40);
		else
			result = weekpay;
	
		System.out.printf("$ %.2f\n" , result);
		}
}


