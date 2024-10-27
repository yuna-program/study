package enumType;

public class ProductStatusMain {
	
	public static void main(String[] args) {
		
		Product product1 = new Product("컴퓨터", ProductStatus.IN_STOCK);
		Product product2 = new Product("모니터", ProductStatus.OUT_OF_STOCK);
		Product product3 = new Product("마우스", ProductStatus.DISCOUNTED);
		
		product1.printProduct();
		product2.printProduct();
		product3.printProduct();
		
	}

}
