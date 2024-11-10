package casting;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		// 명시적 형변환 ( = 캐스팅 )
		
		double doubleValue = 1.5;
		int intValue = 0;
		
//		intValue = (int)doubleValue;
		
		doubleValue = intValue;
		
//		System.out.println(intValue);
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int a = Integer.parseInt(str);
		System.out.println(a);
	}
}
