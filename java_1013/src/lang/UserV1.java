package lang;

public class UserV1 {
	
	public String id;
	
	public UserV1(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 내 클래스의 참조값이랑 매개변수로 받은 객체 인스턴스랑 같으면 return true
		// 같지 않으면 return false
		
		if(this == obj){ // 같을 때
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) { // 다를 때
			return false;
		}
		
//		Object object = new Object();
//		
//		return object.equals(obj);
		
		return super.equals(obj);
		
	}

}
