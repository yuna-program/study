package java_1012;

public class BookMain {
	
	public static void main(String[] args) {
		Book book = new Book();
		book.displayInfo();
		
		Book book2 = new Book("Hello java1", "seo1");
		book2.displayInfo();
		
		Book book3 = new Book("Hello java2", "seo2", 700);
		book3.displayInfo();
	
	}

}
