package collection;

import java.util.HashSet;

//HashSet : 중복허용하지 않고 유일한 데이터를 저장시 사용 (유일데이터이므로 순서상관 X ) 

public class HashSetEx {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("Python");
		set.add("Java");
		
		System.out.println(set);
		
		for(String str : set) {
			System.out.println(str);
		}
		
		set.contains(set.contains("Python"));
		set.contains(set.contains("Pythons"));
		
	}

}
