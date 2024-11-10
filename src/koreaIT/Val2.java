package koreaIT;

public class Val2 {
	public static void main(String[] args) {
		//변수
		//한번에 하나의 값만 저장 & 재할당 가능 
		
		// "두 변수 a, b값 서로 바꾸기" 를 통해 변수의 특징 확인 
		
		int tmp = 0;
		int a = 10;
		int b = 20;
		
		System.out.printf("tmp : %d, a : %d, b : %d", tmp, a, b);
		
		tmp = a;//  tmp(0) < a(10);
		System.out.println("tmp : " + tmp);
		
		a = b; // a(10 ) < b(20)
		System.out.println("a : " + a);
		
		b = tmp; // b(20) < tmp(10)
		System.out.println("b : " + b);
		
		System.out.printf("tmp : %d, a : %d, b : %d", tmp, a, b);
	}

}
