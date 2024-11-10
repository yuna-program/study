package java_1006;

public class Method {
	// 두 숫자를 입력받아서 더하고 출력하는 단순 기능을 메서드로 만들어보세요 
	// 먼저 1 + 2를 수행하고, 그 다음으로 10 + 20을 계산하도록 
	
	int a = 1;
	int b = 2;
	
	public int add(int a, int b) { //return 받음 
		int sum = 0; // 타입 중요
		
		sum = a + b;
		
		return sum;
	}
	
	// 메서드 오버로딩 ( 코드 재사용 )
	
//	public String add(int a, String b) {
//		String result = a + b;
	
////		int sum = 0;
////		return sum;
//		return result;
//	}
	
	//접근 제어자 반환타입 메서드명(매개변수타입 매개변수명){
	// 메서드 본문
	//return;
	// }
}
