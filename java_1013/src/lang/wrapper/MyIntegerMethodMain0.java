package lang.wrapper;

public class MyIntegerMethodMain0 {
	
	public static void main(String[] args) {
		
		int value = 10;
//		int i1 = compareTo(value, 5);
//		int i2 = compareTo(value, 10);
//		int i3 = compareTo(value, 20);
		
//		System.out.println("i1 : " + i1);
//		System.out.println("i2 : " + i2);
//		System.out.println("i3 : " + i3);
		
	}

	//compareTo 메서드 만들기
	
	public int compareTo(int value, int target) {
//		int result = 0;
		if(value < target) {
			return -1;
//			result = -1;
//			return result;
		} else if(target < value) {
			return 1;
		} else {
			return 0;
		}
		
	}


}
