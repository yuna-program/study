package operator;

public class OperatorEx2 {
	public static void main(String[] args) {
		// int 형 score를 선언 
		// score 가 80점 이상이고, 100점 이하이면 true를 출력 아니면 false를 출력
		
		int score =79;
		
		boolean result = (80 <= score) && (score <= 100);
		boolean result1 = (80 <= score) || (score <= 100);
		
		System.out.println(result);
		System.out.println(result1);
		
		if(result) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
