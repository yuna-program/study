package lang.object.poly;

public class MainTest {
	
	public static void main(String[] args) {
		
//		Dog dog = new Dog();
//		Car car = new Car();
		
//		Object dog = new Dog();
//		Object car = new Car();
//		Car car2 = (Car)new Object();
		
//		action(dog);
//		action(car);
		
	}
	
	private static void action(Object obj) {
		
		if(obj instanceof Dog dog) {
			dog.sound();
		} else if(obj instanceof Car car) {
			car.move();
		}
	}

}
