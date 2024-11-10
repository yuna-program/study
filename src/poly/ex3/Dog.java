package poly.ex3;

public class Dog implements InterfaceAnimal{ //전체 다 오버라이드 해야함 
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	@Override
	public void move() {
		System.out.println("멍멍이 이동 ");
	}
	
}
