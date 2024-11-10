package access;

public class Speaker {
	int volume;
	// private int volume - > 다른 클래스에서 접근 X -> 캡슐화
	
	public Speaker(int volume) {
		this.volume = volume;
		
	}
	
	// 볼륨 높이기
	
	void volumeUp() {
		if(volume >= 100) {
			System.out.println("최대음량으로 증가할 수 없음");
		} else {
			volume += 10;
			System.out.println("음량 10 증가 ");
		}
	}
	
	// 볼륨 낮추기 
	
	void volumeDown() {
		volume -= 10;
		System.out.println("음량 10 감소 ");
		
	}
	
	// 현재 음량 보여주기 
	
	void showVolume() {
		System.out.println("현재음량 : " + volume);
		
	}
	// private 접근 제어자로 바뀌면 
	// 이 클래스 안에서만 접근 할 수 있음 = 다른 클래스에서 접근 X

}
