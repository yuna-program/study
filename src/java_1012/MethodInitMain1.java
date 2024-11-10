package java_1012;

public class MethodInitMain1 {
	
	
	public static void main(String[] args) {
		MemberInit init = new MemberInit();
		
		init.name = "user1";
		init.age = 15;
		init.grade = 90;
		
		MemberInit init2 = new MemberInit();
		
		init2.name = "user2";
		init2.age = 116;
		init2.grade = 80;
		
		MemberInit[] members = {init, init2};
		
		for(MemberInit m : members) {
			System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
		}
		
		MemberConstruct construct = new MemberConstruct("학생2", 11, 80);
  		
	}
	static void initMember(MemberInit init, String name, int age, int grade) {
		init.name = name;
		init.age = age;
		init.grade = grade;
	}

}


	
