package cond.ex;

public class ConOpEx2 {
	public static void main(String[] args) {
		// 홀수 짝수 찾기 ( 삼항연산자 사용 )
		// 정수 x가 짝수이면 "짝수"를 홀수이면 "홀수"를 출력하는 프로그램 작성 
		// 짝수 찾는 방법 ( aaa == 나머지 연산자)
		
		int x = 0;
		String result = x % 2 == 1 ? "홀수" : (x % 2 == 0) ? "0" : "짝수"; //중첩
		
		System.out.print("결과는 : " + result);
		
	}

}
