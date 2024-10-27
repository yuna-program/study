package exceptionHandling;

public class ExceptionHandlingEx2Main {
	
	public static void main(String[] args) {
		
		ExceptionHandlingEx2 ex2 = new ExceptionHandlingEx2();
		
		try {
			
			int result = ex2.divide(10, 0);
			System.out.println(result);
			
		} catch (Exception e) {
			
//			e.getMessage();
			e.printStackTrace();
			
		}finally {
			
			System.out.println("무조건 실행");
			
		}
	}

}
