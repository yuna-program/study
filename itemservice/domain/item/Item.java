package hello.itemservice.domain.item;

import lombok.Data;

// 상품 도메인 모델 설계
@Data
public class Item {
	
	// long 타입 id
	private Long id;
	// String 타입 itemName
	private String itemName;
	// Integer 타입 price
	private Integer price;
	// Integer 타입 quantity
	private Integer quantity;
	
	public Item() {}
	
	public Item(String itemName, Integer price, Integer quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
}
