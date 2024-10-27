package collection;

import java.util.LinkedList;
import java.util.Queue;

//Quese : 선입선출(먼저 들어온 데이터 먼저 처리 ) 방식의 자료구조, 줄서기( = 대기열) 와 같은 작업처리 허용

public class QueueEx {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		queue.add("First");
		queue.add("Second");
		queue.add("Third");
		queue.add("Fourth");
		
//		linkedList.add("First0");
//		linkedList.add("Second0");
//		linkedList.add("Third0");
		
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			
			String item = queue.poll(); // queue 첫번째 요소 제거 후 반환 
			System.out.println(item);
			System.out.println("---");
			System.out.println(item);
			
		}
	}

}
