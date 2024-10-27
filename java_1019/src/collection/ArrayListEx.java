package collection;

import java.util.ArrayList;

//ArrayList : 순서가 있는 데이터 관리, 인덱스를 통한 빠른 접근 가능 ( 중복 O ) 
// HashMap : 키 - 값 (Key - value ) 쌍으로 데이터 저장하여 빠른 탐색 가능 ( 키 중복 X, 값중복 O )
// HashSet : 중복허용하지 않고 유일한 데이터를 저장시 사용 (유일데이터이므로 순서상관 X ) 
// LinkedList : 추가 / 삭제가 빈번한 경우에 효율적, 노드 기반 리스트 
// Quese : 선입선출(먼저 들어온 데이터 먼저 처리 ) 방식의 자료구조, 줄서기( = 대기열) 와 같은 작업처리 허용

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("가방 1 " );
		arrayList.add("가방 2 " );
		arrayList.add("가방 3 " );
		arrayList.add("가방 4 " );
		
//		System.out.println(arrayList);
		arrayList.get(1);
		arrayList.get(2);
		arrayList.get(3);
		
	}
}
