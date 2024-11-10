package operator;

public class Logical1 {
	public static void main(String[] args) {
		//논리연산자1
		
		//AND 연산자
		//모두 참이어야 TRUE를 반환
		//거짓이 한개만 있어도 FALSE 를 반환
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(false && true);
		
		// or 연산자
		// 참이 한개만 있어도 true 반환
		//참이 한개도 없으면 false 반환 
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		// 부정 연산 !
		System.out.println("-----");
		System.out.println(!false);
	}

}
