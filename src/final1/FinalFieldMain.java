package final1;

public class FinalFieldMain {
	
	public static void main(String[] args) {
		
		// final 필드 생성자 초기화
		ConstructInit constructInit1 = new ConstructInit(10);
		ConstructInit constructInit2 = new ConstructInit(20);
		
		System.out.println(constructInit1.value);
		System.out.println(constructInit2.value);
		
		System.out.println("---");
		
		// final 필드 - 필드 초기화 
		FieldInit init1 = new FieldInit();
		FieldInit init2 = new FieldInit();
		FieldInit init3 = new FieldInit();
		
		System.out.println(init1.value);
		System.out.println(init2.value);
		System.out.println(init3.value);
		System.out.println(init1.CONST_VALUE);
		
	}

}
