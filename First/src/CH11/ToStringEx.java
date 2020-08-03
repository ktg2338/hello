package CH11;

class Book{
		int bookNumber;
		String bookTitle;
		
		public Book(int bookNumber, String bookTitle) {
			this.bookNumber = bookNumber;
			this.bookTitle = bookTitle;
		}

		@Override
		public String toString() {
			return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
		}
}
public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(200,"개미");
		Book book2 = new Book(100,"개미2");
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book1.toString());

	}

}
