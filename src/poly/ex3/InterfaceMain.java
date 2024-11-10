package poly.ex3;

public class InterfaceMain {
	
	public static void main(String[] args) {
			
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		
		soundAnimal(cat);
		soundAnimal(cow);
		soundAnimal(dog);

	}
	
	private static void soundAnimal(InterfaceAnimal animal) {
		
		System.out.println("동물소리 테스트 시작");
		animal.sound();
		System.out.println("동물소리 테스트 종료 ");
		System.out.println();
		
	}
	
}
