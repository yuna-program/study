package cond;

public class Switch2 {
	public static void main(String[] args) {
		// Switch 문 ( 자바 14 신규 문법 ) 
		// 값 반환에 중점을 둔 표현식 
		
		int grade = 1;
		int coupon = 0;
		
		coupon = switch (grade) {
			case 1 -> 1000;
			case 2 -> 2000;
			case 3 -> 3000;
			case 4 -> 4000;
			default -> 500;
			};
			
		    //명령문과 표현식의 차이 
			//명령문 : 프로그램 제어나 특정 동작을 실행하기 위한 코드 ( 값 반환 없이 단순 흐름제어 ) 
			//표현식 : 값을 반환하는 코드 ( 모든 표현식은 값을 반환함 ) 
	}

}
