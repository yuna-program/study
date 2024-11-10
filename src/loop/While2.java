package loop;

public class While2 {
	public static void main(String[] args) {
		//while 반복문 
		
		int sum = 0;
		int i = 1;
		int endNum = 3;
		
		while(i <= endNum) {
			sum += i; // sum = sum + 1
			i++; // i = 1 + 1
		}
		System.out.println("sum : " + sum);
		
		do {
			sum += i;
			i++;
		}while(i <= endNum);
		
		System.out.println("sum : " + sum);
	}

}
