package poly.ex3;
// 추상 메서드 
//abstract

public abstract class AbstractAnimal {
	
	public abstract void sound(); // abstract 붙으면 뒤에 구현부 없음 
	
	public void move() {
		
		System.out.println("동물이 이동한다. ");
		
	};

}
