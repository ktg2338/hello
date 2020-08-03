package ch07;

import java.util.ArrayList;

public class Book{
	public static void main(String[]args) {
		Book1[] library = new Book1[5];
		library[0] = new Book1("1번북","1번작가");
		library[1] = new Book1("2번북","2번작가");
		library[2] = new Book1("3번북","3번작가");
		library[3] = new Book1("4번북","4번작가");
		library[4] = new Book1("5번북","5번작가");
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i].getBookname());
		}
		for(int i=0; i<library.length; i++) {
			library[i].showbookinfo();
		}
	}
	
}

class Book1{
	private String bookname;
	private String author;
	
	public Book1() {}
	public Book1(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showbookinfo() {
		System.out.println(bookname +", "+author);
	}
}