package ch07;

public class ObjCopy2 {
	public static void main(String[]args) {
		Book1[] Barr1 = new Book1[3];
		Book1[] Barr2 = new Book1[3];
		
		Barr1[0] = new Book1("1번책","1번작가");
		Barr1[1] = new Book1("2번책","2번작가");
		Barr1[2] = new Book1("3번책","3번작가");
		
		Barr2[0] = new Book1();
		Barr2[1] = new Book1();
		Barr2[2] = new Book1();
		
		for(int i = 0; i<Barr1.length; i++) {
			Barr2[i].setBookname(Barr1[i].getBookname());
			Barr2[i].setAuthor(Barr1[i].getAuthor());
		}
		for(int i = 0; i<Barr2.length; i++) {
			Barr2[i].showbookinfo();
		}
	}
}
