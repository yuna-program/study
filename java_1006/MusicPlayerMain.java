package java_1006;

public class MusicPlayerMain {
	
	public static void main(String[] args) {
		// 절차지향 음악 플레이어 
		
		int volume = 0;
		boolean isOn = false;
		
		// 음악 플레이어 켜기 
		isOn = true;
		System.err.println("음악 플레이어를 시작합니다");
		System.out.println("음악 플레이어를 시작합니다");
		
		System.out.println("----------------------------------");
		
		// 볼륨 증가 
		volume++;
		System.out.println("음악 플레이어 볼륨 : " + volume);
		
		// 볼륨 감소 
		volume--;
		System.out.println("음악 플레이어 볼륨 : " + volume);
		
		// 음악 플레이어 실행 
		
		System.out.println("----------------------------------");
		System.out.println("음악 플레이어가 켜져있는지 상태 확인 ");
		if(isOn) {
			System.out.println("음악 플레이어 볼륨 : " + volume);
		} else {
			System.out.println("음악 플레이어 off");
		}
		
		System.out.println("----------------------------------");
		
		// 음악플레이어 끄기
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다");
		
//		MusicPlayerData data = new MusicPlayerData();
//		
//		data.isOn = false;
//		data.volume = 0;
//		String result = "";
//		result = data.on(10);
//		System.out.println(result);
		
	
	}

}
