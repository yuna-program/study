package static1.ex;

public class Car {
	
	private static int totalCars;
	private String name;
	
	public Car(String name) {
		System.out.println("차량구입, 이름 : " + name);
		this.name = name;
		totalCars++;
	}
	
	static void showTotalCars() {
		System.out.println("구매 차량수 : " + totalCars);
		
	} // static 안에서는 static 만 쓸 수 있음 

//	static void toString() {
//		System.out.println("name : " + [name]));
//		
//	}
}
