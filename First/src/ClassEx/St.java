package ClassEx;

public  class St {
	public static void main(String[] args) {
		Square s = new Square();
		Square s1 = new Square();
		s.length = 4;
		s1.length = 6;
		s.area();
		System.out.printf("한변 길이 %d인 정사각형의 넓이 : %d%n", s.length, s.area());
		System.out.printf("한변 길이 %d인 정사각형의 넓이 : %d", s1.length, s1.area());
	} 
}

		
	class Square {
		int length;
			
		int area() {
			return length * length;
			}
		}	
	
