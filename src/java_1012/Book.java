package java_1012;

public class Book {
	
	String title;
	String author;
	int page;
	
	public Book() {
		this("", "", 0); // 안쓰면 null로 출력됨
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
		
	}
	
	public void displayInfo() {
		System.out.println("제목 : " + this.title + " 저자 : "+ this.author + "페이지 : " + this.page);
	}

}
