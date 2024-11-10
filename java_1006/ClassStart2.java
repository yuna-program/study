package java_1006;

public class ClassStart2 {
	
	public static void main(String[] args) {
		// 배열 복습 문제
		// 배열은 특정 타입을 연속한 데이터 구조롤 만들어 하나의 변수로 관리할 수 있음 
		
//		int[] aa = new int[3];
//		int[] aa2 = new int[] {11,22,33};
		
		String[] studentNames = {"학생1" , "학생2"};
		int[] studentAges = {15,16};
		int[] studentGrades = {90,80};
		
		System.out.println("이름 : " + studentNames[0] + " 나이 : " + studentAges[0] + " 성적 : " + studentGrades[0]);
		System.out.println("이름 : " + studentNames[1] + " 나이 : " + studentAges[1] + " 성적 : " + studentGrades[1]);
		
		System.out.println("-------------------------------");

		//for 문의 조건식 구성
		//초기식 : 반복을 시작할 횟수 i (=카운트변수 ) 
		//조건식 : 반복문을 종료시키는 조건 ( 총 반복횟수의 limit 값)
		//증감식 : 카운트 변수  i가 종료조건을 타기위한 코드
		
		System.out.println(studentNames.length);
		
		System.out.println("-------------------------------");
		
		 for(int i = 0; i < studentNames.length; i++) {
				System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrades[i]);
		 }
		 
	} 

}
