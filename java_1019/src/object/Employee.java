package object;

import java.util.Objects;

// equals 메서드 오버라이딩 해서 객체 비교 구현 

// employee 클래스 정의 하고, 필드로 직원이름 id저장
// equals 메서드, 오버라이딩 해서 두 직원 객체 만들고 동일성 비교 

public class Employee {
	
	private String name; // 직원 이름
	private int id; // 직원 아이디
	
	// 생성자 : 직원 이름과 아이디 초기화 하는 매개변수 있는 생성자 
	
	// equals 메서드 재정의해서 두 객체 동등성 비교 
	
	public Employee() {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	// 두 객체의 동등성 비교 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
