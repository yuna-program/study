package static2;

public class DecoData {
	
	private int instanceValue; // 인스턴스 변수 = 객체를 생성해야지 접근 가능 
	private static int staticValue;
	
	public static void staticCall() {
//		instanceValue++;
		staticValue++;
	}

}
