package java_1006;

public class ClassStart3_1 {
	
	public static void main(String[] args) {
		
		Student student1 = new Student(); // x001
		
		student1.age = 15;
		student1.grade = 90;
		student1.name = "학생1";
		
		Student student2 = new Student(); // x002
		System.out.println(student2);
		student2.age = 16;
		student2.grade = 80;
		student2.name = "학생2";
		
		// student 객체를 담을 수 있는 사이즈 2의 배열을 생성 
		// 해당 배열에 student1, student2 인스턴스 참조값을 담는다 

		Student[] students = new Student[2]; // 새로운 주소값을 가짐 
		
		// x003
		students[0] = student1; // x001 참조 주소값을 읽고 > "복사" 해서 > "배열" 변수에 대입
		students[1] = student2; 
		
		// 자바에서 모든 변수의 대입은 항상 값을 복사해서 전달하는거
		
	}

}
