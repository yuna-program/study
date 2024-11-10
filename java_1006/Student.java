package java_1006;

//class 키워드를 사용해서 학생 클래스를 정의
//class는 관래상 대문자로 시작하고 camel

public class Student {
	
	//멤버변수 (=필드) 데이터 각각의 항목 
	
	String name;
	int age;
	int grade;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}

}
