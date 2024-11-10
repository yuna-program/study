package cond.ex;

public class ConOpEx {
	public static void main(String[] args) {
		//더 큰 숫자 찾기 ( 삼항 연산자 사용 )
		//점수 a의 값은 10이고, 점수 b의 값은 20이다
		//삼항연산자를 사용해서 두 숫자중에 더 큰 숫자를 출력하는 코드 작성 
		
		int a = 30;
		int b = 20;
		
		int max = (a < b) ?  b : a;
		System.out.println("둘 중 더 큰 숫자는 : " + max );
	}

}
