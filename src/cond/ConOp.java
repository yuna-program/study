package cond;

public class ConOp {
	public static void main(String[] args) {
		// 삼항 연산자 ( 조건식 ) ? 참표현식 : 거짓 표현식;
		
		//18세 이상이면 status에 "성인" 담고, 아니면 "미성년" (if문으로)
		
		int age = 18;
		String status = "";
		
		if(age <= 18) {
			status = "성인";
		} else {
			status = "미성년";
		}
		
		System.out.println("age = " + age + ", status = " + status);
		
		status = (age <= 18) ? "성인" : "미성년";
		System.out.println("age = " + age + ", status = " + status);
		
//		status = (age <= 18) ? System.out.printf("성인"); : "미성년";
		
	}
}
