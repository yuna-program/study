package exception.basic.checked;

public class Service {
	
	Client client = new Client();
	
	// 예외 catch 해서 처리하는 코드 
	
	public void callCatch() {
		try {
			client.call();
		} catch(Exception e){
			System.out.println("예외처리 메세지 : " + e.getMessage());
		}
		
		System.out.println("정상 동작");
	
	}
	
	public void callThrow() throws MyCheckedException {
		client.call();
	}

}
