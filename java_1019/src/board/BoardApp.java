package board;

import java.util.Scanner;

public class BoardApp {
	// 메인 애플리케이션 클래스 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Board board = new Board();
		
		while(true) { // 무한반복
			
			System.out.println("========== 게시판 앱 ============");
			System.out.println("1. 게시글 추가 ");
			System.out.println("2. 게시글 보기 ");
			System.out.println("3. 게시글 삭제 ");
			System.out.println("4.  종료 ");
			System.out.println("메뉴 선택(1-4) > ");
			
//			String choice = "";
			String choice = scanner.nextLine();
			switch (choice) {
			case "1": 
				System.out.println("게시글 제목 입력 > ");
				String title = scanner.nextLine();
				
				System.out.println("게시글 내용 입력 > ");
				String content = scanner.nextLine();
				
				board.addPost(title, content);
				
				break;
				
			case "2": 
				
				System.out.println("게시글 목록 > ");
				board.viewPost();
				
				break;
				
			case "3" :
				
//				int id = scanner.nextInt();
				int id = Integer.parseInt(scanner.nextLine());
				board.deletePost(id);
				
				break;
				
			case "4":
				
				System.out.println("시스템 종료");
				scanner.close();
				System.exit(0);
				break;
				
			default:
				
				System.out.println("잘못된 입력입니다. ");
				break;
				
			}
			
			// 1 입력했을 때 게시글 추가 기능 수행 
			// 제목, 내용 둘다 각각 입력받아서 저장해야함 
			
			// 2 게시글 보기 
			
			// 3 게시글 삭제 
			// 삭제할 id입력받아야 함 
			// try catch 예외 발생 위험 있는 코드는 try문안에 
			
			// 4 종료 
			// scnaner close자원 해제 
//			System.exit(0);
//			break;
			
			//default 문의 위의 1 ~ 4 까지의 숫자가 아닌 경우 
			// 잘못 입력했다는 안내 
			
		}
	}

}
