package ch07;

public class ObjCopy1 {
	public static void main(String[]args) {
		Book1[] Barr1 = new Book1[3];
		Book1[] Barr2 = new Book1[3];
		
		Barr1[0] = new Book1("1��å","1���۰�");
		Barr1[1] = new Book1("2��å","2���۰�");
		Barr1[2] = new Book1("3��å","3���۰�");
		
		Barr1[0].setBookname("����");
		Barr1[0].setAuthor("�ڿϼ�");
		
		System.arraycopy(Barr1, 0, Barr2 , 0, 3);
	
		System.out.println("=== Barr1 ===");
		for(int i = 0; i < Barr1.length; i++) {
			Barr1[i].showbookinfo();
			}
		
		Barr2[0].setBookname("1��å");
		Barr2[0].setAuthor("1���۰�");
		
		System.out.println("=== Barr2 ===");
		for(int i = 0; i < Barr2.length; i++) {
		Barr2[i].showbookinfo();
		}
		
	}
}
