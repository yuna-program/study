package access.ex;

public class MaxCounter {
	
	// 클래스의 목적 : 최대값 지정하고 최대값 까지만 값이 증가하는 기능 제공 
	
	// 조건 : 접근 제어자를 사용해서 데이터 캡슐화 
	// 이 클래스는 다른 패키지에서도 사용할 수 있어야 함 ( public ) / protected : public + 상속관계의 호출허용
	
	private int count = 0; // 초기값 0 으로 세팅
	private int max;  // 생성자 통해서 할당 
	
	public MaxCounter(int max) {
		this.max = max;
	}
	
	// 만들어야 할 메서드 
	
	// increament( ) 
	
	public void increament() {
		
		//유효성검증
		if(max <= count ) {
		System.out.println("최대값 초과할 수 없음 ");
		return;
		}
		
		// 기능 실행 
		count++;
		
	}
	
	// getCount( ) 
	
	public void getCount() {
//		return count;
	}

}
