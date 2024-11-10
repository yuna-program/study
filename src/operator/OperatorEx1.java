package operator;

public class OperatorEx1 {
	public static void main(String[] args) {
		//문제 1 
		// num1, num2, num3 세개의 int 타입변수 선언 - > 각각 10 , 20 , 30으로 초기화
		//세 변수의 합 계산 - > sum 이름의 변수에 저장 
		// 세 변수의 평균을 계산 - > average 이름의 변수에 저장 
		
		// 이때 소수점 이하의 결과는 버림 
		// 최종 sum과 average 변수의 값을 출력
		
		int num1 = 10;
		int num2 = 22;
		int num3 = 35;
		
		int sum = 0;
		
		double average = 0;
		
		sum = num1 + num2 + num3;
		System.out.println("sum = " + sum);
		
//		average = (double)sum / 3;
		average = sum / 3;
		System.out.println("average = " + average);
		System.out.println("average = " + (int) average);
		
		// double 변수 선언 - > 합과 평균 출력
		// 합의 결과 소수점 이하를 버림, 평균 결과는 소수점 있는 상태로 출력
		
//		double val1 = 1.5;
//		double val2 = 2.5;
//		double val3 = 3.5;
//		
//		int sum = 0;
//		double average = 0;
//		
//		sum = (int)(val1 + val2 + val3);
//		System.out.println(sum);
//		
//		average  = (double)sum / 3;
//		System.out.println(average);
		
	}

}
