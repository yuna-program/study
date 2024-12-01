package hello.itemservice.domain.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository {
	// map 타입 으로 {id , item} 저장할 수 있는 필드 선언 : store 
	private static final Map<Long, Item> store = new HashMap<>();
	// id 저장할 필드 선언 : sequence
	private static long sequence = 0L;
	
	// save 메서드 (반환타입은 Item)
	// 메서드 구현부 : id값 1증가 시키고
	// 증가한 id값이랑 item 객체 store 변수에 put
	// 최종 item return
	public Item save(Item item) {
		item.setId(++sequence);
		store.put(item.getId(), item);
		return item;
	}
	
	// finById 메서드 (반환타입 Item)
	// 파라미터로 id 값 받아서 그 id에 맞는 Item return
	public Item findById(Long id) {
		return store.get(id);
	}
	
	// findAll 메서드 (반환타입 List<Item>)
	// item 리스트 전체 return 
	public List<Item> findAll(){
		return new ArrayList<>(store.values());
	}
	
	// update 메서드 (반환타입 void, 파라미터: Long itemId, Item updateParam) 
	// findById 로 찾아온 Item 객체를 담고
	// 그 객체 각필드에 값 set(updateParam.getItemName())
	
	public void update(Long itemId, Item updateParam) {
		Item findItem = findById(itemId);
		findItem.setItemName(updateParam.getItemName());
		findItem.setPrice(updateParam.getPrice());
		findItem.setQuantity(updateParam.getQuantity());		
	}
}
