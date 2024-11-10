package poly.ex3;

public class AbstractMain {
	
	public static void main(String[] args) {
		
//		AbstractAnimal abstractAnimal = new AbstractAnimal() {
//			@Override
//			public void sound() {
//				
//			}
//		};
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
//		dog.sound();
//		cat.sound();
//		cow.sound();
//		
//		System.out.println("-----");
//		
//		dog.move();
//		cat.move();
//		cow.move();
		
		System.out.println("--0--");
//		soundAnimal(dog);
		System.out.println("--1--");
//		soundAnimal(cat);
		System.out.println("--2--");
//		soundAnimal(cow);
		System.out.println("--3--");
		
	}
	
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작 ");
		animal.sound();
		System.out.println("동물 소리 테스트 종료 ");
	}

}
