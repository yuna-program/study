package java_1006;

public class ClassStart3 {
	
	public static void main(String[] args) {
		// 객체 생성 왜하는지
		// "클래스가 가진 필드 값들을 조작하기 위함"
		// 조작 : 변수에 데이터 값을 넣을 수도 있고 뺄 수도 있고 
		
		Student student1 = new Student(); // 클래스에 접근할 수 있는 객체 생성 
		                                  // 학생 타입 데이터들을 담아둘 수 있는 변수 선언 / 인스턴스 생성
		System.out.println(student1); // 객체에 대한 참조값 / 객체 = 인스턴스
		
		student1.age = 15;
		student1.grade = 90;
		student1.name = "학생1";
		
		Student student2 = new Student();
		System.out.println(student2);
		
		student2.age = 16;
		student2.grade = 80;
		student2.name = "학생2";
		
		System.out.println("-------------------------------");
		
		System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
		System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
		
		// 클래스 = 설계도 이고 이 "클래스"를 기반으로 
		// 실제 메모리 " 어딘가에" 만들어진 실체를 객체 또는 인스턴스 
		
		// 결론 
		// Student student1 = new Student( ); student 객체 생성
		// student1 = x001; // new Student( ) 의 결과로 참조 주소값 반환 
		
	}

}
