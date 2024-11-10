package java_1012;

public class MemberConstruct {
	
	String name;
	//String feildName;
	int age;
	int grade;
	
	public MemberConstruct() {
		System.out.println("객체 생성 되었음 ");
	}
	
	public MemberConstruct(String name, int age) {
//		this(name, age);
		this.name = name;
		this.age = age;
//		this.grade = 50;
	}
	
	public MemberConstruct(String name, int age, int grade) {
//		this.name = name;
//		//feildName = name;
//		this.age = age;
//		this.grade = grade;
		this(name, age);
		this.grade = grade;
		
		
	}

}
