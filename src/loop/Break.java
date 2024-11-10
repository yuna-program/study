package loop;

public class Break {
	
	public static void main(String[] args) {
		// break 문 &  continue문 (반복문에서 사용할 수 있는 키워드)
		//while문, do while문, for문 과 같은 모든 반복문에서 사용가능 
		
		//break문 : 반복문 즉시 종료 후 반복문 전체를 빠져나감
		
		// 숫자 1부터 계속 누적해서 더하다가 (while문으로)
		// 처음으로 그 합값이 10보다 커지는 값은 무엇인지 출력
		// (1 + 2 + 3 + .... 계속 더하다가 처음으로 10일 넘어가는 값을 출력 ) 
		
		int sum = 0;
		int i = 1;
		 
		while (true) {
			sum += sum + i;
			
			if(10 < sum) {
				System.out.println("i : " + sum);
				break;
			}
			System.out.println(sum);
		}
	}
}
