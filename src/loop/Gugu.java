package loop;

public class Gugu {
	
	public static void main(String[] args) {
		// 중첩 for문 사용해서 구구단 출력 ( 1단 부터 9단 까지 )

		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n" , i, j, i*j);
			}
			System.out.println("-------------");
		}
	}
	//for문 : 반복횟수가 정해진 작업을 할때 사용 
	//장점 : 초기화, 조건식, 증감식 코드를 한줄에서 처리할 수 있어서 간결하다 

}
