package array;

public class Array2 {
	
	public static void main(String[] args) {
		// int 형 변수 5개를 담을 수 있는 배열 생성 
		
		int[] students = new int[5];
		// ㅁㅁㅁㅁㅁ 변수 5개 생성
		
		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;
		
		System.out.println("학생1 점수 : " + students[0]);
		System.out.println("학생2 점수 : " + students[1]);
		System.out.println("학생3 점수 : " + students[2]);
		System.out.println("학생4 점수 : " + students[3]);
		System.out.println("학생5 점수 : " + students[4]);
		
		System.out.println("-----------------");
		
		// Alt + shift + A -> 한번에 s 붙일 수 있음 
		
		//for문으로 리팩토링
		//리펙토링이란 : 기존의 코드 기능은 유지하면서 가독성 향상 or 유지 보수 용이하게 수정하는 것
		
		System.out.println(students.length);
		
		System.out.println("-----------------");
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("학생 " +  i + "점수 " + students[i]);
		}
	}

}
