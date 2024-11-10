package static1.ex;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("k");
		Car car2  = new Car("g80");
		Car car3 = new Car("genesis");
		
		Car.showTotalCars(); // 구매한 차량 수를 출력하는 static 메서드 
				
		// 위의 코드 실행에 오류가 없도록 Car 클래스 생성 
		// private static int totalCars;
		// private String name;
		
//		String str = "학생 1";
//		String str1 = "학생 2";
//		System.out.println(str.equals(str1));
	
	}

}