package collection;

import java.util.LinkedList;

//LinkedList : 추가 / 삭제가 빈번한 경우에 효율적, 노드 기반 리스트 

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList<String> es = new LinkedList<>();
		
		es.add("First");
		es.add("Second");
		es.add("Third");
		
		es.addFirst("Zero");
		es.addLast("Last");
		
		System.out.println(es);
		
		for(String string : es) {
			System.out.println(string);
		}
		
	}

}
