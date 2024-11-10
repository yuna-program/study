package lang.string;

import java.util.Arrays;

public class CharArrayMain {
	
	public static void main(String[] args) {
		char[] charArr = new char[]	{'h','e','l','l','o'};
		String str1 = "hello";
		String str2 = new String("hello"); 
		String[] strs = {str1, str2}; // 배열 -> object 상속받고 있음
		
		System.out.println(charArr.length); // 몇번째 
		System.out.println(charArr);
		System.out.println(str1);
		
		Object object =  new Object();
		object.toString();
		
		System.out.println(strs);
		
		System.out.println(strs[0] + strs[1]);
		
		for(int i = 0; i < strs.length -1; i++) {
			System.out.println(strs[i]);
		}
		
		System.out.println(Arrays.toString(strs)); // 배열 형식으로 출력
		
		for(String s : strs) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println(str1.charAt(0));

		System.out.println();
		
		System.out.println(str2);
		System.err.println(str2.substring(0)); // 몇번째까지 자름

		System.out.println();
		
		System.out.println(str2.substring(2,4)); // 2번째 부터 4번째까지 출력
		
		System.out.println();

		System.out.println(str2.indexOf("e")); // 어떠한 글자가 몇번째에 있는지 봄
		
		System.out.println();
		
		System.out.println(str1.concat(str2)); // 합침
		
		System.out.println();
		
		System.out.println(str1.trim()); // 양쪽 공백 제거 
		
		
//		char[] charArr = new char[5];
		
//		for(char c : charArr) {
//			System.out.println(charArr);
//		}
		
//		String str1 = "hello";
//		
//		System.out.println(str1);
//		System.out.println(str1.indexOf("1", 3));
//		
	}

}
