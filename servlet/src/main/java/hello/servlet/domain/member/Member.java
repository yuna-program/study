package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;
// 회원정보 요구사항
// 이름 : username
// 나이 : age
// 회원 도메인 모델
//@Getter @Setter
public class Member {
	private Long id;
	private String username;
	private int age;
	
	// 매개변수 있는 생성자 만들면, 기본 생성자는 자동으로 안생김
	// 객체 생성 할때 기본생성자 호출해서 안만들어짐
	public Member() {}

	public Member(String username, int age) {
		this.username = username;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", username=" + username + ", age=" + age + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
