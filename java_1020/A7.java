package java_1020;

public class A7 {
	
	public static void main(String[] args) {
		String str = new String("is name");
		String str2 = new String("is name");
		
		System.out.println(str == str2); // 객체 비교
		System.out.println(str.equals(str2));
		
		System.out.println();
		
		String str3 = "is name";
		String str4 = "is nmae";
		
		System.out.println(str3 == str4);
	}

}
