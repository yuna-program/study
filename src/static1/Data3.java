package static1;

public class Data3 {
	
	public String name;
	public static int count; // 값을 출력할 때 1씩 증가함 
	// public int count; -> 값이 증가하지 않음 
	
	public Data3(String name) {
		
		this.name = name;
		count++;
		
	}

}
