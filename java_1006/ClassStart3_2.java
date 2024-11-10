package java_1006;

public class ClassStart3_2 {
	
	public static void main(String[] args) {
		// Student 배열 타입으로 바꾸고
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		Student[] students = {student1, student2};
		
		students[0].name = "학생1";
		students[0].age = 15;
		students[0].grade = 90;
		
		students[1].name = "학생2";
		students[1].age = 16;
		students[1].grade = 80;
		
		for(int i = 0; i < students.length; i ++) {
			students[i].name = "학생" + (i+1);
			students[i].age += (i-1);
			students[i].grade = 90;
			
			System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age + " 점수 : " + students[i].grade);
		}
		
		System.out.println("-------------------------------");
	
		//각각 값 할당
		//아래에서 for문 써서 출력
		
		for(Student s : students) {
			System.out.println();
			System.out.println(s.age);
			System.out.println(s.name);
			System.out.println(s.grade);
		}
		
//		for(int i = 0; i < students.length; i++) {
//			System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age + " 점수 : " + students[i].grade);
//		}
		
	}

}
