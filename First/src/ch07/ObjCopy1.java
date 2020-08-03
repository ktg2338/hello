package ch07;

public class ObjCopy1 {
	public static void main(String[]args) {
		Book1[] Barr1 = new Book1[3];
		Book1[] Barr2 = new Book1[3];
		
		Barr1[0] = new Book1("1번책","1번작가");
		Barr1[1] = new Book1("2번책","2번작가");
		Barr1[2] = new Book1("3번책","3번작가");
		
		Barr1[0].setBookname("나목");
		Barr1[0].setAuthor("박완서");
		
		System.arraycopy(Barr1, 0, Barr2 , 0, 3);
	
		System.out.println("=== Barr1 ===");
		for(int i = 0; i < Barr1.length; i++) {
			Barr1[i].showbookinfo();
			}
		
		Barr2[0].setBookname("1번책");
		Barr2[0].setAuthor("1번작가");
		
		System.out.println("=== Barr2 ===");
		for(int i = 0; i < Barr2.length; i++) {
		Barr2[i].showbookinfo();
		}
		
	}
}
