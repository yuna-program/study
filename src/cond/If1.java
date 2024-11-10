package cond;

public class If1 {
	public static void main(String[] args) {
		// if문
		
		int age = 17; // 사용자 나이 
		
		if(18 < age) { //if문의 조건이 거짓인 경우 아래 코드블럭 수행 안하고 다음블럭으로 감
			System.out.println("성인입니다");
		} else { 
			System.out.println("미성년입니다");
		}
		
//		if(age < 18) {
//			System.out.println("미성년입니다");
//		}
		
		// if문은 특정 조건이 참인지 확인하고 
		// 조건이 참인 경우에만 코드블럭을 실행한다 
		// *코드블럭 : {  }
		
		if(true) System.out.println("조건문 탔음");
	}

}
