package java_1006;

public class ProductOrderMain {
	
	public static void main(String[] args) {
		// 여러 상품의 주문 정보를 담는 배열 생성 
		// 상품 주문 정보를 productorder 타입의 변수로 받아 저장 
		// 상품 주문 정보와 최종 금액 출력
		
		// 상품명 : 두부, 가격 : 2000, 수량 : 2
		// 상품명 : 김치, 가격 : 5000, 수량 : 1
		// 상품명 : 콜라, 가격 : 1000, 수량 : 2
		
//		ProductOrder[] orders = new ProductOrder[3];
		
		ProductOrder productorder1 = new ProductOrder();
		ProductOrder productorder2 = new ProductOrder();
		ProductOrder productorder3 = new ProductOrder();
		
		ProductOrder[] po = {productorder1, productorder2, productorder3};
		
		po[0].productName = "두부";
		po[0].price = 2000;
		po[0].quantity = 2;
		
		po[1].productName = "김치";
		po[1].price = 5000;
		po[1].quantity = 1;
		
		po[2].productName = "콜라";
		po[2].price = 1000;
		po[2].quantity = 2;
		
		for(int i = 0; i > po.length; i++) {
			System.out.println("상품명 : " + po[i].productName + " 가격 : " + po[i].price + " 판매 수량 : " + po[i].quantity);
		}
		
		
			
//		for(int i = 0; i < po.length; i++ ) {
//			if(po[0].price > 10000 || po[1].price > 10000) {
//				po[0].price = (po[0].price - 1000);
//				po[1].price = (po[1].price - 1000); // 하나라도 true이면 둘 다 1000원 씩 discount 됨 
//			}
//			System.out.println("상품명 : " + po[i].productName + " 가격 : " + po[i].price + " 판매 수량 : " + po[i].quantity);
//		}
		
//		for(ProductOrder po : orders) {
//			System.out.println("상품명 : " + po.productName ..);
//		}
	}

}