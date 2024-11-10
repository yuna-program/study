package access;

public class SpeakerMain {
	// private : 모든 외부 호출 막음 
	// (default) : 같은 패키지 호출은 허용 
	// protected : 같은 패키지 호출은 허용 + 상속 관계 호출은 허용 
	// public : 모든 외부 호출 허용 
	
	public static void main(String[] args) {
		
		Speaker speaker = new Speaker(90);
		System.out.println(speaker.volume);
		
		System.out.println("---------------------");
		
		speaker.showVolume();
		speaker.volumeUp();
		speaker.showVolume();
		
		speaker.volumeDown();
		speaker.showVolume();
		
	}

}
