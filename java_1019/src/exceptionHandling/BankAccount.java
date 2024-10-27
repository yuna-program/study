package exceptionHandling;

// throws : 메서드 선언부에서 예외 발생시 던질 수 있음을 명시함 ( = 이 메서드 호출한 쪽에서 예외 처리해야 함을 알림 )
// throw : 특정 조건에서 예외를 직접 발생시킴( = 예외 객체 만듬 ) 

// 사용자가 초기값을 입력하면 그 값으로 계좌 잔액 필드 초기화 
// withdraw 메서드 생성 : 출금하는 메서드 + 잔액 부족 예외를 처리할 수 있는 메서드로 작성 
// if 잔액이 부족하면 잔액 부족관련 throw 키워드로 예외 생성해서 throw 
// 잔액 부족이 아니면 출금 ( 잔액 -= 사용자입력금액 ) 

public class BankAccount {
	
	// 총액 필드  ( = 사용자 입력값 누적합 하는 필드 ) 
	int amount;
	// 잔액 필드 
	int balance;
	
	//withdraw 메서드 생성 ( 출금 ) 
	// 그 구현부에서 if 조건 : 잔액이 부족하면 잔액부족관련 throw 키워드로 예외 생성 
	// 잔액 부족이 아니면 출금 ( 잔액 - = 사용자입력금액 ) 
	
	public void withdraw(int amount) throws InsufficientFundsException {
		
		if (balance < amount) {
			
			throw new InsufficientFundsException("예외발생함");
			
		}
		
		balance -= amount; // 출금 
		
	}
	
	// deposit 메서드 생성 ( 입금 ) 
	// 잔액 + 사용자 입력금액 
	
	public void deposit(int amount) {
		
		balance += amount;
		System.out.println("입금액 : " + amount + ", 잔액 : " + balance);
		
	}
	
}

class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException(String message) {
		
		super(message);
		
	}
	
}
