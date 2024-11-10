package loop;

public class While {
	public static void main(String[] args) {
		
		// while 반복문 ( 조건이 false일 때 까지 무한 루프 )
		// 조건식이 참이면 코드블럭{ } 반복해서 실행 
		
		int count = 0;
		 
		count = count + 1;
		count = count + 1;
		count = count + 1;
		count = count + 1;
		count = count + 1;
		count = count + 1;
		
		System.out.println(count);
		
		count = 0;
		
		while (count < 5) {
			count += 1;
		}
	}

}
