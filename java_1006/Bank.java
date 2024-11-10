package java_1006;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
	
//	은행 계좌 입출금 시스템 
//
//	다음의 실행 예시를 참고하셔서, 사용자로 부터 계속 입력을 받아서 
//	입금과 출금을 반복 수행하는 프로그램을 작성 
//
//	또한 간단한 메뉴를 표시해서 어떤 동작을 수행해야 할지 선택할 수 있게 해주세요 
//
//	출금시 잔액이 부족하다면 "X"원을 출금하려 했으나 잔액이 부족합니다 라는 문구를 출력해주세요 
//
//
//	---------------------------------------------------------------------------------------
//	1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료 
//	---------------------------------------------------------------------------------------
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 잔액  : ");
		int su = scanner.nextInt();
		
			
			if(su == 0) {
				System.out.println("현재 잔액이 부족합니다. ");
			} else {
				
				System.out.println("----------------------------------------------------");
				
				System.out.println(" >>> ");
				
				System.out.println("1 . 입금");
				System.out.println("2. 출금");
				System.out.println("3. 잔액 확인 ");
				System.out.println("4. 종료");
				
				System.out.println(" >>> ");
				
				int num = scanner.nextInt();
			
				if(num == 1) {
					System.out.println("선택 1");
					System.out.println("입금액을 입력하세요 : ");
					int num1 = scanner.nextInt();
					int sum = su + num1;
					System.out.println(num1 + "원을 입금하셨습니다. 현재 잔액 : " + sum);
				} else if(num == 2) {
					System.out.println("선택 2");
					System.out.println("출금액을 입력하세요 : ");
					int num2 = scanner.nextInt();
					int sum2 = su - num2;
					System.out.println(num2 + "원을 입금하셨습니다. 현재 잔액 : " + sum2);
				} else if(num == 3) {
					System.out.println("선택 3");
					System.out.println("현재 잔액 : " + su);
				} else if(num == 4) {
					System.out.println("시스템을 종료합니다.");
				}
			}
		

//		switch (num) {
//			case 1: {
//				System.out.println("선택 1");
//				System.out.println("입금액을 입력하세요 : ");
//				int num1 = scanner.nextInt();
//				int sum = su + num1;
//				System.out.println(num1 + "원을 입금하셨습니다. 현재 잔액 : " + sum);
//			case 2 : 
//				System.out.println("선택 2");
//				System.out.println("출금액을 입력하세요 : ");
//				int num2 = scanner.nextInt();
//				int sum2 = su - num2;
//			case 3 : 
//				System.out.println("선택 3");
//				System.out.println("현재 잔액 : " + su);
//			case 4 : 
//				System.out.println("시스템을 종료합니다.");
//		}
//		}
	}
}
