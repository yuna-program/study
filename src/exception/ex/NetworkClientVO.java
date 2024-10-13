package exception.ex;

public class NetworkClientVO {
	
	private final String address;
	
	public NetworkClientVO(String address) {
		this.address = address;
	}
	
	public void connect() {
		System.out.println(address + " 서버 연결 성공 ");
	}

	public String send(String data) {
		System.out.println(address + " 서버에 데이터 전송 " + data);
		return "success";
	}
	
	public void disconnect() {
		System.out.println(address + " 서버 연결 해제 ");
	}
	
}
