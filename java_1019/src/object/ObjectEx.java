//package object;
//
//import java.util.Objects;
//
//public class ObjectEx {
//	private String name;
//	
//	public ObjectEx() {
//		super();
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "ObjectEx [name = "  + name + "]";
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		// 내 클래스의 참조값이랑 매개변수로 받은 객체 인스턴스랑 같으면 return true
//		// 같지 않으면 return false
//		
//		if(this == obj){ // 같을 때
//			return true;
//		}
//		
//		if(obj == null || getClass() != obj.getClass()) { // 다를 때
//			return false;
//		}
//	
//
//}
