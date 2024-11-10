package operator;

public class Compare2 {
	public static void main(String[] args) {
		// 문자열 비교 equals( )
		
		String str1 = "문자열1";
		String str2 = "문자열2";
		
		boolean result1 = "hello".equals(str2);
		System.out.println(result1);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("문자열1"));
	}

}
