package java_1013;

public class BoardApp {
	
	public static void main(String[] args) {
		
		Board board = new Board(1, "작성자1", "글내용1");
		
//		Board board2 = new Board();
		
//		board2.setBno(1);
//		board2.setWriter("d");
//		board2.setBno("dd");
		
//		Board board = Board.getInstance();
//		
//		System.out.println(board2.getBno());
//		System.out.println(board2.getWriter());
//		System.out.println(board2.getContent());
		
		System.out.println(board.getBno());
		System.out.println(board.getWriter());
		System.out.println(board.getContent());
		
//		// 객체 동일성 비교
//		System.out.println(board == board2);
//		System.out.println(board);
//		System.out.println(board2);
//		
//		// 문자열 동등성 비교
//		String str1 = "123";
//		String str2 = "123";
		
//		System.out.println(board.toString(12, "ddd", "fff"));
	}

}
