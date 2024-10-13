package java_1013;

public class Board {
	
	// 게시글 번호 bno
	// 글작성자 writer
	// 글내용 content
	
	// 내가 지정해놓은 메서드 안에서 값을 지정할 수 있도록
	// private을 써서 숨겨놓음
	private int bno;
	private String writer;
	private String content;
	private static Board instance;
	
//	public static Board getInstance() {
//		// 객체 반환 
//		// null 아닐때만 객체 반환하는 유효성 검증 
//		
//		if(instance == null) {
//			instance = new Board();
//		}
//		
//		return instance;
//	}
	
	// 매개변수 있는 생성자 
	// 객체 생성시점에 위에 필드 한번에 초기화 해주는 거
	
	//getter / setter
	
	public Board(int bno, String writer, String content) {
		this.bno = bno;
		this.writer = writer;
		this.content = content;
	}
	
	public void setBno(int bno) {
		this.bno = bno;
	}
	
	public int getBno() {
		return bno;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setContent() {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
//	@Override
//	public String toString() {
//		return "글번호는" + bno + "작성자" + writer + " 내용 " + content;
//	}
	
}
