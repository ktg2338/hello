package ClassEx;

public  class St {
	public static void main(String[] args) {
		Square s = new Square();
		Square s1 = new Square();
		s.length = 4;
		s1.length = 6;
		s.area();
		System.out.printf("�Ѻ� ���� %d�� ���簢���� ���� : %d%n", s.length, s.area());
		System.out.printf("�Ѻ� ���� %d�� ���簢���� ���� : %d", s1.length, s1.area());
	} 
}

		
	class Square {
		int length;
			
		int area() {
			return length * length;
			}
		}	
	
