package java_1012;

public class MethodInitMain2 {
	
	public static void main(String[] args) {
//		MethodInitMain1 = initMain1 = new MethodInitMain1();

		MemberInit init = new MemberInit();
		
//		initMain1.initMembe3r(init,"학생1", 15,70);
		
		System.out.println(init.name);
		System.out.println(init.age);
		System.out.println(init.grade);
	}

}
