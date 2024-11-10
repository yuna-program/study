package operator;

public class Operator3 {
	public static void main(String[] args) {
		// 연산자 우선순위 
		// 상식선에서 생각할 것 ( 우선순위표 암기 절대 노)
		//애매할 때는 괄호 사용하기 
		
		int sum1 = 2 * 2 + 3 * 3 / 3 + 2;
		sum1 = (2 * (2 + 3)) * 3 / 3 + 2;
		System.out.println(sum1);
		
		// 코드는 누가봐도 쉽고 명확히 이해할 수 있는 코드가 좋은 코드
		//애매하거나 복잡한 코드는 대사절 
		// 개발에서 제일 중요한 것은 "단순" "명확"
	}

}
