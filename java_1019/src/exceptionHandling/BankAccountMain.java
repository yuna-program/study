package exceptionHandling;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액 입력 > ");
		
//		int intBalance = scanner.nextInt();
				
		try {
			
			int depositBalance = scanner.nextInt();
			account.deposit(depositBalance); // 입력한 금액 입금 
			
			int withdrawBalance = scanner.nextInt();
			account.withdraw(withdrawBalance); // 입력한 금액 출금 
			
		} catch (InsufficientFundsException e) {
			
			e.getStackTrace();
//			System.out.println(e.getMessage());
			
		} finally {
			
			System.out.println("오류상관없이 항상호출");

		}
		
		System.out.println("정상흐름");
		
	}
}
