package cond.ex;

public class SwitchEx {
	public static void main(String[] args) {
		// 점수에 따라서 아래와 같이 등급을 출력(switch 문 사용)
		
		// 90점 : a
		// 80점 : b
		// 70점 : c
		// 60점 : d
		
		int score = 80;
		String grade = "";
		
		switch (score) {
		case 90 : grade = "a"; //단순 값비교 case 쓰임
			break;
		case 80 : grade = "b";
			break;
		case 70 : grade = "c";
			break;
		case 60 : grade = "d";
			break;
		}
		
//		grade = switch(score) {
//		case 90 -> "a";
//		case 80 -> "b";
//		case 70 -> "c";
//		case 60 -> "d";
//		default -> "d";
//		};
		// switch 문 - > 단순 명확한 값 비교 
		
		System.out.println("grade = " + grade);
	}

}
