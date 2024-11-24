package hello.springmvc.basic;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// 파라미터 바인딩 받을 객체 
@Data // 이거 있으면 toString, 매개변수 있는 생성자 안써도 됨
// getter, setter, toString, requiredArgsConstructor
public class HelloData {
	
	private String username;
	private int age;
	
}
