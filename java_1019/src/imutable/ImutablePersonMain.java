package imutable;

public class ImutablePersonMain {

	public static void main(String[] args) {
		
		ImutablePerson imutablePerson = new ImutablePerson("영희" , 13);
		
		int age = imutablePerson.getAge();
		age = 15;
		
		System.out.println(age);
		
//		ImutablePerson im = imutablePerson.withName("홍길동222", 123);
	}
}
