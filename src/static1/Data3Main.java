package static1;

public class Data3Main {
	
	public static void main(String[] args) {
		
		Data3 data3 = new Data3("A"); // 없어도 됨
		System.out.println("A count : " + data3.count); // static 이라서 data3.count 로 접근 할 수 있음 
														// 패키지 명.count
		
		Data3 data4 = new Data3("A");
		System.out.println("A count : " + data4.count);
		
		Data3 data5 = new Data3("A");
		System.out.println("A count : " + data5.count);
		
	}

}
