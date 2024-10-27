package object;

import java.util.Objects;

// 예제 1 : 다양한 객체를 Object 타입으로 참조하고 toString 을 통해서 각각의 객체 정보 출력하기 

// 요구사항 
// Shpe 클래스 정의해서 도형의 종류를 저장 
// Shape 객체를 Object 타입으로 참조 
// toString( ) 메서드를 오버라이딩 해서 도형 정보를 출력 

// 두 도형의 정보 출력하는 프로그램

public class Shape {
	
	private String type; // 도형의 종류 저장하는 type 필드 
	
	public Shape() {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Shape [type=" + type + "]";
	}
	
//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		
//		if(obj == null || getClass() != obj.getClass()) {
//			return false;
//		}
//		return super.equals(obj);
//	}
//	
	

}
