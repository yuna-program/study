package collection;

import java.util.HashSet;

// HashSet : 중복허용하지 않고 유일한 데이터를 저장시 사용 (유일데이터이므로 순서상관 X ) 
// HashSet 만들고 3개 입력한 다음에 중복이면은 다른값 들어가도록

public class HashSetEx1 {
	
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("Java");
		
//		// 데이터 추가 
//		hashSet.add("Java");
//		hashSet.add("Python");
//		hashSet.add("Java");
//		
//		String input = "";
//		
//		// 반복문 안에서 중복이면 다른값 들어가도록 
//		for(String s : hashSet) {
//			
//			if(s == input) {
//				
//				input = "jsScript";
//				
//			}
//			
//			hashSet.add(input);
//			
//		}
//		
//		// 출력 
//		System.out.println(hashSet);
		
	}

}
