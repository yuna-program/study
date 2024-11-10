package operator;

public class Compare {
	public static void main(String[] args) {
		//비교연산자
		
		int a= 3;
		int b = 2;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println("--------");
		
		
		// 비교연산의 결과는 boolean 타입
		
		boolean result = (a == b);
		System.out.println(result);
	}

}
