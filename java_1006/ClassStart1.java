package java_1006;

public class ClassStart1 {
	
	public static void main(String[] args) {
		// 클래스가 필요한 이유 
		
		// 학생 정보 출력 프로그램 만들기 
		// 두명의 학생정보를 단순 출력하는 프로그램 
		
		// 요구사항 
		//첫번째 학생 이름 ' 학생 1 ' 나이는 15 성적 90
		//두번째 학생 이름 ' 학생 2 ' 나이는 16 성적 80
		//각 학생의 정보를 아래와 같은 문자열 형식을 출력
		// "이름 :[이름] 나이 : [나이 ] 성적: [성적]"
		
		//변수 사용 학생 정보 저장 - > 학생 정보 출력 
		
		String student1Name = "학생1";
		int student1Age = 15;
		int student1Grade = 90;
		
		String student2Name = "학생2";
		int student2Age = 16;
		int student2Grade = 80;
		
		System.out.println("이름 : " + student1Name + " 나이 : " + student1Age + " 성적 : " + student1Grade);
		System.out.println("이름 : " + student2Name + " 나이 : " + student2Age + " 성적 : " + student2Grade);
		
	}

}
