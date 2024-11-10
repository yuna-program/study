package java_1006;

public class Overloading {
	
	public static void main(String[] args) {
		
		// 두 정수값 받아서 더하는 add 메서드 ( 값 반환 )  
		// 두 정수값 받아서 곱하는 mul 메서드 ( 값 반환 )
		
		// 더한 합값과 곱한값을 한문장에 출력하는 메서드 
		// void 타입 
		
		System.out.println(printOut(3,5));
//		printOut(3,5);
	
	}
		static int add(int a, int b) {
			return a + b;
		}
		static int mul(int a, int b) {
			return a*b;
		}
		
		static String printOut(int a, int b) {
			
			int sum = add(a, b);
			int sum2 = mul(a, b);
			
			return "sum : " + sum + " sum2 : " + sum2;
		}
}
