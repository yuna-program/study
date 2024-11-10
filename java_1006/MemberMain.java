package java_1006;

public class MemberMain {
	
	public static void main(String[] args) {
		Member member = new Member();
		
//		member.name = "회원1";
//		member.age = 15;
//		member.grade = 5;
		
		member.initMember("회원1", 15, 5);
		
		System.out.println("name : " + member.name + " age : " + member.age + " grade : " + member.grade);
		
		// 절차 지향 프로그램 & 객체 지향 프로그램 
		// 절차 지향은  데이터랑 해당 데이터에 대한 처리방식이 분리되어있음 
		// 객체 지향은 데이터에 대한 메서드가 하나의 객체 안에 포함되어있음
	}

}
