package exception.ex;

public class NetworkClientVO2 {
	
	private final String address;
	public boolean connectError;
	public boolean sendError;
	
	public NetworkClientVO2(String address) {
		this.address = address;
	}
	
	//서버 연결하는 메서드  ( + 데이터 값이 유효한지 initError() 로 확인 )
	public String connect(String data) {
		initError(data);
		
		if(connectError) {
			System.out.println(address + "서버 연결 실패");
			return "connectError";
		}
		
		System.out.println(address + "서버 연결 성공 ");
		
		return "success";
		
	}
	
	public String send(String data) {
//		initError(data);
		
		if(sendError) {
			System.out.println(address + " 서버 데이터 전송 실패 " + data);
			return "sendError";
		}
		
		System.out.println(address + " 서버에 데이터 전송 " + data);
		return "success";
		
	}
	
	// 연결 해제
	public void disconnect() {
		System.out.println(address + " 서버 연결 해제 ");
	}
	
	// 초기화 에러(이상한 데이터 값 받았을 때 오류 발생)
	public void initError(String data) {
		
		if(data.contains("error1")){
			connectError = true; // 연결에러 상태
//			sendError = true; // 
		}
		if(data.contains("error2")) {
			sendError = true; //데이터 전송 에러
//			connectError = false;
		}
		
	}
	
}
