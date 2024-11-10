package loop;

public class For {
	
	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식)
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		// for문은 반복횟수에 직접적인 영향을 주는 변수 선언, 그 변수를 조건식에서 활용, 그 변수를 증감조건을 통해서 
		
		int sum = 0;
		int endNum = 3;
		// for문으로 1부터 3까지 반복하면서 sum 누적합 출력
		
		for(int i = 1; i <= endNum; i++) {
			sum += sum + i;
		}
		System.out.println("sum : " + sum);
	}
}
