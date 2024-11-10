package scope;

public class Scope1 {
	
	public static void main(String[] args) {
		int a = 0;
		// 지역변수 : 본인의 지역(코드블럭{ }) 안에서만 쓸 수 있는 변수 
		
		//스코프 : 변수의 접근 가능 범위 
		// 지역변수는 변수를 선언한 시점부터 코드블록이 끝날때까지 사용 가능한 변수 
		
		int m = 10; // m 스코프 시작 
		if(true) {
			int x = 20;
			System.out.println("m = " + m);
			System.out.println("x = " + x);
		}
	}

}
