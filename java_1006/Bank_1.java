//package java_1006;
//
//import java.util.Scanner;
//
//public class Bank_1 {
//
//	public static void main(String[] args) {
//		
//		int balance = 0;
//		int amount = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		while (true) {
//			System.out.println("1. 입금 2. 출력 3. 잔액 확인 4. 종료 ");
//			
//			int choice = scanner.nextInt();
//			
//			switch (choice) {
//				case 1: {
//				System.out.println("입금액입력 > ");
//				
//				amount = scanner.nextInt();
//				balance += amount;
//				
//				System.out.println(amount + " 를 입력했습니다 현재 잔액 : " + balance);
////				break;
//				case 2 : 
//					System.out.println("출금액 입력 > ");
//					
//					amount = scanner.nextInt();
//					
//					if(amount <= balance) {
//						balance -= amount;
//						System.out.println(amount + "를 출금했습니다. 현재 잔액 : " + balance);
//					} else {
//						System.out.println("잔액이 없습니다. ");
//					}
//					
//					break;
//				case 3:
//					System.out.println("현재 잔액 : " + balance);
//					break;
//				case 4 : 
//					System.out.println("시스템 종료");
//					break;
//			}
//		}
//	}
//
//}
//}
