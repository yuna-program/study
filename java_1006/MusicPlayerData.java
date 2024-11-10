package java_1006;

public class MusicPlayerData {
	
	int volume = 0;
	boolean isOn = false;
//	String st = "";

	static void on(MusicPlayerData data) {
		data.isOn = true;
	}
	
//	static String on(MusicPlayerData data) {
//		return "아아아";
//	}
	
	static void off(MusicPlayerData data) {
		data.isOn = false;
	}
	
	static void volumeUp(MusicPlayerData data) {
		data.volume++;
	}
	
	static void volumeOff(MusicPlayerData data) {
		data.volume--;
	}

}
